package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: gT2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5600gT2 implements InterfaceC11011wD0, InterfaceC2828Vt3 {
    public static final PA0 j = new PA0("proto");
    public final WW2 a;
    public final InterfaceC4919eV g;
    public final InterfaceC4919eV h;
    public final C5716go i;

    public C5600gT2(InterfaceC4919eV interfaceC4919eV, InterfaceC4919eV interfaceC4919eV2, C5716go c5716go, WW2 ww2) {
        this.a = ww2;
        this.g = interfaceC4919eV;
        this.h = interfaceC4919eV2;
        this.i = c5716go;
    }

    public final SQLiteDatabase b() {
        WW2 ww2 = this.a;
        Objects.requireNonNull(ww2);
        InterfaceC4919eV interfaceC4919eV = this.h;
        long a = interfaceC4919eV.a();
        while (true) {
            try {
                return ww2.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e) {
                if (interfaceC4919eV.a() >= this.i.c + a) {
                    throw new C2568Tt3("Timed out while trying to open db.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    public static Long c(SQLiteDatabase sQLiteDatabase, C2149Qo c2149Qo) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(c2149Qo.a, String.valueOf(AbstractC7911nA2.a(c2149Qo.c))));
        byte[] bArr = c2149Qo.b;
        if (bArr != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb.append(" and extras is null");
        }
        Cursor query = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            return !query.moveToNext() ? null : Long.valueOf(query.getLong(0));
        } finally {
            query.close();
        }
    }

    public static String h(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((C11209wo) it.next()).a);
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    public final Object f(InterfaceC2698Ut3 interfaceC2698Ut3) {
        SQLiteDatabase b = b();
        InterfaceC4919eV interfaceC4919eV = this.h;
        long a = interfaceC4919eV.a();
        while (true) {
            try {
                b.beginTransaction();
                try {
                    Object a2 = interfaceC2698Ut3.a();
                    b.setTransactionSuccessful();
                    return a2;
                } finally {
                    b.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e) {
                if (interfaceC4919eV.a() < this.i.c + a) {
                    SystemClock.sleep(50L);
                } else {
                    throw new C2568Tt3("Timed out while trying to acquire the lock.", e);
                }
            }
        }
    }

    public final Object e(InterfaceC4912eT2 interfaceC4912eT2) {
        SQLiteDatabase b = b();
        b.beginTransaction();
        try {
            Object apply = interfaceC4912eT2.apply(b);
            b.setTransactionSuccessful();
            return apply;
        } finally {
            b.endTransaction();
        }
    }

    public static Object i(Cursor cursor, InterfaceC4912eT2 interfaceC4912eT2) {
        try {
            return interfaceC4912eT2.apply(cursor);
        } finally {
            cursor.close();
        }
    }
}
