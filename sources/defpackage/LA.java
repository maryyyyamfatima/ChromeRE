package defpackage;

import android.content.Context;
import android.widget.CompoundButton;
import com.android.chrome.R;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.bookmarks.BookmarkBridge;
import org.chromium.components.bookmarks.BookmarkId;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class LA extends AbstractC1684Mz {
    public final Context a;
    public final Runnable g;
    public C4496dF h = new C4496dF();
    public PropertyModel i;
    public C8938qA j;
    public BookmarkId k;
    public C0768Fx2 l;
    public boolean m;
    public final InterfaceC0984Ho3 n;
    public C3809bF o;
    public String p;

    public LA(C8938qA c8938qA, PropertyModel propertyModel, Context context, CA ca, C3063Xo3 c3063Xo3) {
        this.j = c8938qA;
        c8938qA.b(this);
        this.i = propertyModel;
        this.a = context;
        this.g = ca;
        this.n = c3063Xo3;
    }

    public final void j(BookmarkId bookmarkId, boolean z) {
        BookmarkBridge.BookmarkItem f = this.j.f(bookmarkId);
        this.p = this.j.s(f.e);
        PropertyModel propertyModel = this.i;
        PD2 pd2 = MA.m;
        Context context = this.a;
        propertyModel.o(pd2, context.getResources().getString(z ? R.string.f69430_resource_name_obfuscated_res_0x7f1402a7 : R.string.f69420_resource_name_obfuscated_res_0x7f1402a6));
        this.i.o(MA.b, WA.c(context, bookmarkId.getType()));
        this.i.k(MA.c, f.b());
        this.i.o(MA.l, context.getResources().getString(z ? R.string.f69360_resource_name_obfuscated_res_0x7f1402a0 : R.string.f69400_resource_name_obfuscated_res_0x7f1402a4, this.p));
    }

    public final void k(final CompoundButton compoundButton, final boolean z) {
        if (this.o == null) {
            this.o = this.h.b(new Callback() { // from class: KA
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    LA la = LA.this;
                    la.getClass();
                    boolean z2 = ((Integer) obj).intValue() == 0;
                    if (!z2) {
                        PropertyModel propertyModel = la.i;
                        PD2 pd2 = MA.i;
                        propertyModel.o(pd2, null);
                        boolean z3 = true ^ z;
                        compoundButton.setChecked(z3);
                        la.i.o(pd2, new JA(la));
                        la.l(z3);
                    }
                    la.m(z2);
                }
            });
        }
        l(z);
        AbstractC2717Ux2.d(this.n, this.j, this.k, z, this.o);
        EI2.h(z ? 1 : 2, 3, "PowerBookmarks.BookmarkSaveFlow.PriceTrackingEnabled");
    }

    public final void m(boolean z) {
        this.i.k(MA.k, z);
        this.i.o(MA.f, this.a.getResources().getString(z ? R.string.f82470_resource_name_obfuscated_res_0x7f140887 : R.string.f82480_resource_name_obfuscated_res_0x7f140888));
    }

    public final void l(boolean z) {
        this.i.o(MA.e, AbstractC2884Wf.a(this.a, z ? R.drawable.f52170_resource_name_obfuscated_res_0x7f090412 : R.drawable.f52160_resource_name_obfuscated_res_0x7f090411));
    }

    @Override // defpackage.AbstractC1684Mz
    public final void c() {
        BookmarkId bookmarkId = this.k;
        if (bookmarkId == null || this.j.f(bookmarkId) == null) {
            this.g.run();
        } else {
            j(this.k, this.m);
        }
    }
}
