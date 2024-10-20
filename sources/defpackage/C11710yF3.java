package defpackage;

import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: yF3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11710yF3 extends LifecycleCallback {
    public final ArrayList g;

    public C11710yF3(DA1 da1) {
        super(da1);
        this.g = new ArrayList();
        da1.c("TaskOnStopCallback", this);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void i() {
        synchronized (this.g) {
            Iterator it = this.g.iterator();
            while (it.hasNext()) {
                InterfaceC6219iF3 interfaceC6219iF3 = (InterfaceC6219iF3) ((WeakReference) it.next()).get();
                if (interfaceC6219iF3 != null) {
                    interfaceC6219iF3.cancel();
                }
            }
            this.g.clear();
        }
    }
}
