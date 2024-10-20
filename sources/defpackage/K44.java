package defpackage;

import android.os.Process;
import java.util.HashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class K44 {
    public final long a = Process.myTid();
    public HashMap b = new HashMap();

    public final void a() {
        if (this.a != Process.myTid()) {
            throw new IllegalStateException("UserData must only be used on a single thread.");
        }
        if (this.b == null) {
            throw new IllegalStateException("Operation is not allowed after destroy().");
        }
    }

    public final J44 d(Class cls, J44 j44) {
        a();
        if (!((cls == null || j44 == null) ? false : true)) {
            throw new IllegalArgumentException("Neither key nor object of UserDataHost can be null.");
        }
        this.b.put(cls, j44);
        return b(cls);
    }

    public final J44 b(Class cls) {
        a();
        if (!(cls != null)) {
            throw new IllegalArgumentException("Neither key nor object of UserDataHost can be null.");
        }
        return (J44) cls.cast(this.b.get(cls));
    }

    public final void c(Class cls) {
        a();
        if (!this.b.containsKey(cls)) {
            throw new IllegalStateException("UserData for the key is not present.");
        }
    }
}
