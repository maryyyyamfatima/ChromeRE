package defpackage;

import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class YA3 extends AA3 {
    public final /* synthetic */ Callback b;
    public final /* synthetic */ VA3 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YA3(InterfaceC12028zA3 interfaceC12028zA3, Callback callback, VA3 va3) {
        super(interfaceC12028zA3);
        this.b = callback;
        this.c = va3;
    }

    @Override // defpackage.AA3
    public final void a() {
        super.a();
        this.b.onResult(new WA3(this.c, 1, null));
    }
}
