package defpackage;

import J.N;
import android.content.Context;
import com.android.chrome.R;
import java.util.Arrays;
import org.chromium.chrome.browser.omnibox.a;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.components.omnibox.AutocompleteMatch;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.base.Clipboard;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: aw0 */
/* loaded from: classes.dex */
public final class C3703aw0 extends AbstractC12286zw {
    public final Context f;
    public final InterfaceC9158qp g;
    public final InterfaceC0079Ap3 h;
    public final InterfaceC0079Ap3 i;
    public boolean j;

    @Override // defpackage.InterfaceC7471lu0
    public final int f() {
        return 1;
    }

    public C3703aw0(Context context, C1245Jp c1245Jp, InterfaceC9158qp interfaceC9158qp, TH0 th0, InterfaceC0079Ap3 interfaceC0079Ap3, C8846pu0 c8846pu0) {
        super(context, c1245Jp, th0);
        this.f = context;
        this.g = interfaceC9158qp;
        this.i = interfaceC0079Ap3;
        this.h = c8846pu0;
    }

    @Override // defpackage.InterfaceC7444lp3
    public final boolean c(AutocompleteMatch autocompleteMatch, int i) {
        Tab tab;
        if (i != 0 || (tab = (Tab) this.i.get()) == null || !tab.isInitialized() || tab.isNativePage() || C8693pT2.W0(tab) || autocompleteMatch.a != 0 || !autocompleteMatch.j.equals(tab.getUrl())) {
            return false;
        }
        if (!this.j) {
            this.j = true;
            ((a) this.g).o("");
        }
        return true;
    }

    @Override // defpackage.InterfaceC7471lu0
    public final PropertyModel g() {
        return new PropertyModel(AbstractC8132np3.e);
    }

    @Override // defpackage.AbstractC12286zw, defpackage.InterfaceC7444lp3
    public final void b(int i, final AutocompleteMatch autocompleteMatch, PropertyModel propertyModel) {
        super.b(i, autocompleteMatch, propertyModel);
        propertyModel.o(AbstractC8132np3.b, new C7788mp3(((Tab) this.i.get()).getTitle()));
        propertyModel.o(AbstractC8132np3.c, new C7788mp3(autocompleteMatch.d));
        Context context = this.a;
        C5382fp3 c = C5382fp3.c(context, R.drawable.0_resource_name_obfuscated_res_0x7f090212);
        c.b = true;
        AbstractC12286zw.k(propertyModel, c.a());
        C5382fp3 c2 = C5382fp3.c(context, R.drawable.0_resource_name_obfuscated_res_0x7f090317);
        c2.d = true;
        c2.b = true;
        C5726gp3 a = c2.a();
        Runnable runnable = new Runnable() { // from class: Xv0
            @Override // java.lang.Runnable
            public final void run() {
                C3703aw0 c3703aw0 = C3703aw0.this;
                c3703aw0.getClass();
                FI2.a("Omnibox.EditUrlSuggestion.Share");
                InterfaceC0079Ap3 interfaceC0079Ap3 = c3703aw0.i;
                Tab tab = (Tab) interfaceC0079Ap3.get();
                if (tab != null && tab.b() != null) {
                    N.M$ejnyHh(((Tab) interfaceC0079Ap3.get()).b(), "Omnibox.EditUrlSuggestion.Share", "HasOccurred");
                }
                ((a) c3703aw0.g).o.Z(null, 12, false);
                ((J63) c3703aw0.h.get()).b(5, (Tab) interfaceC0079Ap3.get(), false);
            }
        };
        Context context2 = this.f;
        C5382fp3 c3 = C5382fp3.c(context, R.drawable.0_resource_name_obfuscated_res_0x7f0901df);
        c3.d = true;
        c3.b = true;
        C5382fp3 c4 = C5382fp3.c(context, R.drawable.0_resource_name_obfuscated_res_0x7f0900b1);
        c4.d = true;
        c4.b = true;
        propertyModel.o(AbstractC0240Bw.b, Arrays.asList(new C0110Aw(context2, a, R.string.0_resource_name_obfuscated_res_0x7f140643, runnable), new C0110Aw(context2, c3.a(), R.string.0_resource_name_obfuscated_res_0x7f1403d6, new Runnable() { // from class: Yv0
            @Override // java.lang.Runnable
            public final void run() {
                C3703aw0 c3703aw0 = C3703aw0.this;
                c3703aw0.getClass();
                FI2.a("Omnibox.EditUrlSuggestion.Copy");
                WebContents b = ((Tab) c3703aw0.i.get()).b();
                if (b != null && !b.isDestroyed()) {
                    N.MFBCVxdl(b);
                }
                Clipboard.getInstance().b(autocompleteMatch.j);
            }
        }), new C0110Aw(context2, c4.a(), R.string.0_resource_name_obfuscated_res_0x7f140298, new Runnable() { // from class: Zv0
            @Override // java.lang.Runnable
            public final void run() {
                C3703aw0 c3703aw0 = C3703aw0.this;
                c3703aw0.getClass();
                FI2.a("Omnibox.EditUrlSuggestion.Edit");
                ((a) c3703aw0.g).o(autocompleteMatch.j.i());
            }
        })));
        this.c.b(autocompleteMatch.j, false, new C11943yw(this, propertyModel));
    }

    @Override // defpackage.AbstractC12286zw, defpackage.InterfaceC7471lu0
    public final void d(boolean z) {
        if (z) {
            return;
        }
        this.j = false;
    }

    @Override // defpackage.AbstractC12286zw
    public final void j(AutocompleteMatch autocompleteMatch, int i) {
        super.j(autocompleteMatch, i);
        FI2.a("Omnibox.EditUrlSuggestion.Tap");
    }
}
