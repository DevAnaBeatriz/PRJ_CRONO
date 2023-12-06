package com.example.cronoscronometro.room;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.cronoscronometro.model.Cronos;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.processing.Generated;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class CronosDatabaseDao_Impl implements CronosDatabaseDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Cronos> __insertionAdapterOfCronos;

  private final EntityDeletionOrUpdateAdapter<Cronos> __deletionAdapterOfCronos;

  private final EntityDeletionOrUpdateAdapter<Cronos> __updateAdapterOfCronos;

  public CronosDatabaseDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfCronos = new EntityInsertionAdapter<Cronos>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `cronos` (`id`,`title`,`crono`) VALUES (nullif(?, 0),?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Cronos value) {
        stmt.bindLong(1, value.getId());
        if (value.getTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTitle());
        }
        stmt.bindLong(3, value.getCrono());
      }
    };
    this.__deletionAdapterOfCronos = new EntityDeletionOrUpdateAdapter<Cronos>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `cronos` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Cronos value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfCronos = new EntityDeletionOrUpdateAdapter<Cronos>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR REPLACE `cronos` SET `id` = ?,`title` = ?,`crono` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Cronos value) {
        stmt.bindLong(1, value.getId());
        if (value.getTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTitle());
        }
        stmt.bindLong(3, value.getCrono());
        stmt.bindLong(4, value.getId());
      }
    };
  }

  @Override
  public Object insert(final Cronos crono, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfCronos.insert(crono);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object delete(final Cronos crono, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfCronos.handle(crono);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object update(final Cronos crono, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfCronos.handle(crono);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Flow<List<Cronos>> getCronos() {
    final String _sql = "SELECT * FROM cronos";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"cronos"}, new Callable<List<Cronos>>() {
      @Override
      public List<Cronos> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfCrono = CursorUtil.getColumnIndexOrThrow(_cursor, "crono");
          final List<Cronos> _result = new ArrayList<Cronos>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Cronos _item;
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final long _tmpCrono;
            _tmpCrono = _cursor.getLong(_cursorIndexOfCrono);
            _item = new Cronos(_tmpId,_tmpTitle,_tmpCrono);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<Cronos> getCronosById(final long id) {
    final String _sql = "SELECT * FROM cronos WHERE id = ? ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"cronos"}, new Callable<Cronos>() {
      @Override
      public Cronos call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfCrono = CursorUtil.getColumnIndexOrThrow(_cursor, "crono");
          final Cronos _result;
          if(_cursor.moveToFirst()) {
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final long _tmpCrono;
            _tmpCrono = _cursor.getLong(_cursorIndexOfCrono);
            _result = new Cronos(_tmpId,_tmpTitle,_tmpCrono);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
