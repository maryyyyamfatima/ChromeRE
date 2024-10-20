package defpackage;

import android.content.SharedPreferences;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Q83 {
    public C9873su a;
    public final HashMap b = new HashMap();

    public Q83() {
        if (this.a == null) {
            this.a = new C9873su();
        }
    }

    public final void a(final P83 p83) {
        SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: N83
            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                P83.this.a(str);
            }
        };
        this.b.put(p83, onSharedPreferenceChangeListener);
        T60.a.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    public final void o(P83 p83) {
        SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = (SharedPreferences.OnSharedPreferenceChangeListener) this.b.get(p83);
        if (onSharedPreferenceChangeListener == null) {
            return;
        }
        T60.a.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    public final Set j(String str) {
        return k(str, Collections.emptySet());
    }

    public final Set k(String str, Set set) {
        this.a.a(str);
        Set<String> stringSet = T60.a.getStringSet(str, set);
        if (stringSet != null) {
            return Collections.unmodifiableSet(stringSet);
        }
        return null;
    }

    public final void b(String str, String str2) {
        this.a.getClass();
        SharedPreferences sharedPreferences = T60.a;
        HashSet hashSet = new HashSet(sharedPreferences.getStringSet(str, Collections.emptySet()));
        hashSet.add(str2);
        sharedPreferences.edit().putStringSet(str, hashSet).apply();
    }

    public final void l(String str, String str2) {
        this.a.getClass();
        SharedPreferences sharedPreferences = T60.a;
        HashSet hashSet = new HashSet(sharedPreferences.getStringSet(str, Collections.emptySet()));
        if (hashSet.remove(str2)) {
            sharedPreferences.edit().putStringSet(str, hashSet).apply();
        }
    }

    public final void u(String str, Set set) {
        this.a.getClass();
        T60.a.edit().putStringSet(str, set).apply();
    }

    public final void q(int i, String str) {
        this.a.getClass();
        SharedPreferences.Editor edit = T60.a.edit();
        edit.putInt(str, i);
        edit.apply();
    }

    public final void r(int i, String str) {
        this.a.getClass();
        SharedPreferences.Editor edit = T60.a.edit();
        edit.putInt(str, i);
        C7432ln3 e = C7432ln3.e();
        try {
            edit.commit();
            e.close();
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    public final int f(int i, String str) {
        this.a.a(str);
        C7432ln3 c = C7432ln3.c();
        try {
            int i2 = T60.a.getInt(str, i);
            c.close();
            return i2;
        } catch (Throwable th) {
            try {
                c.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    public final void d(String str) {
        this.a.getClass();
        SharedPreferences sharedPreferences = T60.a;
        int i = sharedPreferences.getInt(str, 0) + 1;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putInt(str, i);
        edit.apply();
    }

    public final void s(long j, String str) {
        this.a.a(str);
        SharedPreferences.Editor edit = T60.a.edit();
        edit.putLong(str, j);
        edit.apply();
    }

    public final long h(String str) {
        return g(0L, str);
    }

    public final long g(long j, String str) {
        this.a.a(str);
        C7432ln3 c = C7432ln3.c();
        try {
            long j2 = T60.a.getLong(str, j);
            c.close();
            return j2;
        } catch (Throwable th) {
            try {
                c.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    public final void p(String str, boolean z) {
        this.a.a(str);
        SharedPreferences.Editor edit = T60.a.edit();
        edit.putBoolean(str, z);
        edit.apply();
    }

    public final boolean e(String str, boolean z) {
        this.a.a(str);
        C7432ln3 c = C7432ln3.c();
        try {
            boolean z2 = T60.a.getBoolean(str, z);
            c.close();
            return z2;
        } catch (Throwable th) {
            try {
                c.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    public final void t(String str, String str2) {
        this.a.a(str);
        SharedPreferences.Editor edit = T60.a.edit();
        edit.putString(str, str2);
        edit.apply();
    }

    public final boolean v(String str, String str2) {
        this.a.getClass();
        SharedPreferences.Editor edit = T60.a.edit();
        edit.putString(str, str2);
        C7432ln3 e = C7432ln3.e();
        try {
            boolean commit = edit.commit();
            e.close();
            return commit;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    public final String i(String str, String str2) {
        this.a.a(str);
        C7432ln3 c = C7432ln3.c();
        try {
            String string = T60.a.getString(str, str2);
            c.close();
            return string;
        } catch (Throwable th) {
            try {
                c.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    public final void m(String str) {
        this.a.a(str);
        SharedPreferences.Editor edit = T60.a.edit();
        edit.remove(str);
        edit.apply();
    }

    public final boolean n(String str) {
        this.a.getClass();
        SharedPreferences.Editor edit = T60.a.edit();
        edit.remove(str);
        return edit.commit();
    }

    public final boolean c(String str) {
        this.a.a(str);
        return T60.a.contains(str);
    }
}
