package defpackage;

import android.content.SharedPreferences;
import android.os.StrictMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class M83 implements EP0 {
    public static final C4317ck g = new C4317ck();
    public final SharedPreferences a;
    public final Runnable b;
    public final L83 c;
    public final Object d;
    public volatile Map e;
    public final ArrayList f;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.content.SharedPreferences$OnSharedPreferenceChangeListener, L83] */
    public M83(SharedPreferences sharedPreferences, RunnableC11928yt2 runnableC11928yt2) {
        ?? r0 = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: L83
            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences2, String str) {
                M83 m83 = M83.this;
                synchronized (m83.d) {
                    m83.e = null;
                    m83.b.run();
                }
                synchronized (m83) {
                    Iterator it = m83.f.iterator();
                    if (it.hasNext()) {
                        X5.a(it.next());
                        throw null;
                    }
                }
            }
        };
        this.c = r0;
        this.d = new Object();
        this.f = new ArrayList();
        this.a = sharedPreferences;
        this.b = runnableC11928yt2;
        sharedPreferences.registerOnSharedPreferenceChangeListener(r0);
    }

    @Override // defpackage.EP0
    public final Object a(String str) {
        Map<String, ?> map = this.e;
        if (map == null) {
            synchronized (this.d) {
                map = this.e;
                if (map == null) {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        Map<String, ?> all = this.a.getAll();
                        this.e = all;
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        map = all;
                    } catch (Throwable th) {
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        throw th;
                    }
                }
            }
        }
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    public static synchronized void b() {
        synchronized (M83.class) {
            Iterator it = ((C3630ak) g.values()).iterator();
            while (it.hasNext()) {
                M83 m83 = (M83) it.next();
                m83.a.unregisterOnSharedPreferenceChangeListener(m83.c);
            }
            g.clear();
        }
    }
}
