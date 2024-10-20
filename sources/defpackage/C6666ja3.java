package defpackage;

import org.chromium.components.signin.AccountManagerFacade;
import org.chromium.components.signin.AccountManagerFacadeProvider;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ja3 */
/* loaded from: classes.dex */
public final class C6666ja3 implements InterfaceC5298fb3, InterfaceC9979tC2, F4 {
    public final AccountManagerFacade a;
    public boolean g;
    public final /* synthetic */ AbstractC7010ka3 h;

    @Override // defpackage.InterfaceC5298fb3
    public final void b() {
        AbstractC7010ka3 abstractC7010ka3 = this.h;
        abstractC7010ka3.a();
        ((NK0) abstractC7010ka3).b();
    }

    @Override // defpackage.InterfaceC5298fb3
    public final void g() {
        AbstractC7010ka3 abstractC7010ka3 = this.h;
        abstractC7010ka3.a();
        ((NK0) abstractC7010ka3).b();
    }

    @Override // defpackage.InterfaceC5298fb3
    public final void i() {
        AbstractC7010ka3 abstractC7010ka3 = this.h;
        abstractC7010ka3.a();
        ((NK0) abstractC7010ka3).b();
    }

    public C6666ja3(NK0 nk0) {
        this.h = nk0;
        AccountManagerFacade accountManagerFacadeProvider = AccountManagerFacadeProvider.getInstance();
        this.a = accountManagerFacadeProvider;
        nk0.d.b(this);
        nk0.f.a(this);
        accountManagerFacadeProvider.b(this);
    }

    @Override // defpackage.F4
    public final void E() {
        ((NK0) this.h).b();
    }

    @Override // defpackage.InterfaceC9979tC2
    public final void u(String str) {
        ((NK0) this.h).b();
    }
}
