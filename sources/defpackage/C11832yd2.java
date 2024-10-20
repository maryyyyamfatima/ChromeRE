package defpackage;

import java.lang.ref.WeakReference;
import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: yd2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11832yd2 {
    public final C11489xd2 a;
    public final WeakReference b;
    public final Callback c;

    public C11832yd2(InterfaceC7697ma2 interfaceC7697ma2, Callback callback) {
        C11489xd2 c11489xd2 = new C11489xd2(this);
        this.a = c11489xd2;
        this.b = new WeakReference(interfaceC7697ma2);
        this.c = callback;
        ((C8385oa2) interfaceC7697ma2).m(c11489xd2);
    }
}
