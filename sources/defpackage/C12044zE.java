package defpackage;

import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: zE, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12044zE extends XD2 implements InterfaceC9646sE2 {
    public final Callback h;
    public Object i;

    public C12044zE(XD2 xd2, Object obj, Callback callback) {
        super(xd2.g);
        this.h = callback;
        xd2.b(this);
        this.i = obj;
    }

    @Override // defpackage.InterfaceC9646sE2
    public final void a(int i, Object obj) {
        this.i = obj;
        Callback callback = this.h;
        if (callback != null) {
            callback.onResult(this);
        }
    }
}
