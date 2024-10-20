package defpackage;

import android.os.Parcel;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Cv4 extends AbstractBinderC6443iu4 {
    public final HashMap g;
    public boolean h;
    public Object i;
    public final Class j;

    public Cv4(Class cls) {
        super("com.google.android.youtube.player.internal.IAsyncResultCallback");
        this.g = new HashMap();
        this.j = cls;
    }

    @Override // defpackage.AbstractBinderC6443iu4
    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            int i2 = AbstractC5419fv4.a;
            boolean z = parcel.readInt() != 0;
            synchronized (this) {
                if (this.j == Boolean.class) {
                    e(Boolean.valueOf(z));
                }
            }
        } else {
            if (i != 2) {
                return false;
            }
            long readLong = parcel.readLong();
            synchronized (this) {
                if (this.j == Long.class) {
                    e(Long.valueOf(readLong));
                }
            }
        }
        parcel2.writeNoException();
        return true;
    }

    public final void e(Object obj) {
        try {
            this.i = this.j.cast(obj);
            this.h = true;
            HashMap hashMap = new HashMap(this.g);
            for (InterfaceC8791pl interfaceC8791pl : hashMap.keySet()) {
                ((Executor) hashMap.get(interfaceC8791pl)).execute(new RunnableC10913vv4(this, interfaceC8791pl));
            }
        } catch (ClassCastException unused) {
        }
    }
}
