package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: us2 */
/* loaded from: classes.dex */
public final class C10550us2 extends AbstractC4734dw1 implements InterfaceC7670mV0 {
    public final /* synthetic */ C11236ws2 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10550us2(C11236ws2 c11236ws2) {
        super(1);
        this.g = c11236ws2;
    }

    @Override // defpackage.InterfaceC7670mV0
    public final Object b(Object obj) {
        Throwable th = (Throwable) obj;
        if (th != null) {
            InterfaceC5462g31 interfaceC5462g31 = (InterfaceC5462g31) C11236ws2.f.e().f(th);
            GW1 gw1 = Tr4.c;
            C11236ws2 c11236ws2 = this.g;
            Sr4 a = c11236ws2.d.a();
            JX0 jx0 = (JX0) a.l(PX0.NEW_BUILDER);
            jx0.m(a);
            Rr4 rr4 = (Rr4) jx0;
            EnumC6432is4 enumC6432is4 = c11236ws2.a;
            AbstractC0087Ar1.e(enumC6432is4, "value");
            if (rr4.h) {
                rr4.l();
                rr4.h = false;
            }
            Sr4 sr4 = (Sr4) rr4.g;
            sr4.getClass();
            sr4.l = enumC6432is4.a;
            sr4.j |= 2;
            QX0 j = rr4.j();
            AbstractC0087Ar1.d(j, "_builder.build()");
            AbstractC6690je3.a((InterfaceC5462g31) interfaceC5462g31.l(gw1, (Sr4) j), "Error saving to disk cache", "com/google/android/libraries/search/rendering/xuikit/runtime/persistentstore/PersistentByteStoreInstaller$PersistenceSubscription$storeInDiskCache$1", "invoke", 226, "");
        }
        return C8546p14.a;
    }
}
