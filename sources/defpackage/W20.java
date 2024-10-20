package defpackage;

import android.content.ContentResolver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Binder;
import android.os.StrictMode;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class W20 implements EP0 {
    public static final C4317ck h = new C4317ck();
    public static final String[] i = {"key", "value"};
    public final ContentResolver a;
    public final Uri b;
    public final Runnable c;
    public final V20 d;
    public final Object e;
    public volatile Map f;
    public final ArrayList g;

    public W20(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        V20 v20 = new V20(this);
        this.d = v20;
        this.e = new Object();
        this.g = new ArrayList();
        this.a = contentResolver;
        this.b = uri;
        this.c = runnable;
        contentResolver.registerContentObserver(uri, false, v20);
    }

    public static W20 c(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        W20 w20;
        synchronized (W20.class) {
            C4317ck c4317ck = h;
            w20 = (W20) c4317ck.get(uri);
            if (w20 == null) {
                try {
                    W20 w202 = new W20(contentResolver, uri, runnable);
                    try {
                        c4317ck.put(uri, w202);
                    } catch (SecurityException unused) {
                    }
                    w20 = w202;
                } catch (SecurityException unused2) {
                }
            }
        }
        return w20;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [android.os.StrictMode$ThreadPolicy, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v3, types: [U20] */
    @Override // defpackage.EP0
    public final Object a(String str) {
        Map map;
        Map map2;
        Object a;
        Map map3 = this.f;
        Map map4 = map3;
        if (map3 == null) {
            synchronized (this.e) {
                ?? r0 = this.f;
                map2 = r0;
                if (r0 == 0) {
                    try {
                        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            ?? r2 = new Object() { // from class: U20
                                public final Object a() {
                                    Map hashMap;
                                    W20 w20 = W20.this;
                                    Cursor query = w20.a.query(w20.b, W20.i, null, null, null);
                                    if (query == null) {
                                        return Collections.emptyMap();
                                    }
                                    try {
                                        int count = query.getCount();
                                        if (count == 0) {
                                            return Collections.emptyMap();
                                        }
                                        if (count <= 256) {
                                            hashMap = new C4317ck(count);
                                        } else {
                                            hashMap = new HashMap(count, 1.0f);
                                        }
                                        while (query.moveToNext()) {
                                            hashMap.put(query.getString(0), query.getString(1));
                                        }
                                        query.close();
                                        return hashMap;
                                    } finally {
                                        query.close();
                                    }
                                }
                            };
                            try {
                                a = r2.a();
                            } catch (SecurityException unused) {
                                long clearCallingIdentity = Binder.clearCallingIdentity();
                                try {
                                    a = r2.a();
                                } finally {
                                    Binder.restoreCallingIdentity(clearCallingIdentity);
                                }
                            }
                            map = (Map) a;
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                        } catch (SQLiteException | IllegalStateException | SecurityException unused2) {
                            Log.e("ConfigurationContentLdr", "PhenotypeFlag unable to load ContentProvider, using default values");
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                            map = null;
                        }
                        this.f = map;
                        map2 = map;
                    } catch (Throwable th) {
                        StrictMode.setThreadPolicy(r0);
                        throw th;
                    }
                }
            }
            map4 = map2;
        }
        if (map4 == null) {
            map4 = Collections.emptyMap();
        }
        return (String) map4.get(str);
    }

    public final void d() {
        synchronized (this.e) {
            this.f = null;
            this.c.run();
        }
        synchronized (this) {
            Iterator it = this.g.iterator();
            if (it.hasNext()) {
                X5.a(it.next());
                throw null;
            }
        }
    }

    public static void e(Uri uri) {
        synchronized (W20.class) {
            W20 w20 = (W20) h.get(uri);
            if (w20 != null) {
                w20.d();
            }
        }
    }

    public static synchronized void b() {
        synchronized (W20.class) {
            Iterator it = ((C3630ak) h.values()).iterator();
            while (it.hasNext()) {
                W20 w20 = (W20) it.next();
                w20.a.unregisterContentObserver(w20.d);
            }
            h.clear();
        }
    }
}
