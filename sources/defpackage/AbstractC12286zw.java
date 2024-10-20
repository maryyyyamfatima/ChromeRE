package defpackage;

import J.N;
import android.content.Context;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import com.android.chrome.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.chromium.chrome.browser.omnibox.a;
import org.chromium.chrome.browser.omnibox.suggestions.AutocompleteController;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tabmodel.TabModel;
import org.chromium.components.omnibox.AutocompleteMatch;
import org.chromium.components.omnibox.AutocompleteResult;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: zw */
/* loaded from: classes.dex */
public abstract class AbstractC12286zw implements InterfaceC7444lp3 {
    public final Context a;
    public final InterfaceC6070hp3 b;
    public final TH0 c;
    public final int d;
    public final int e;

    @Override // defpackage.InterfaceC7471lu0
    public void a() {
    }

    @Override // defpackage.InterfaceC7471lu0
    public void d(boolean z) {
    }

    @Override // defpackage.InterfaceC7471lu0
    public /* synthetic */ void e() {
    }

    public AbstractC12286zw(Context context, C1245Jp c1245Jp, TH0 th0) {
        this.a = context;
        this.b = c1245Jp;
        context.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f08062c);
        this.d = context.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f08062b);
        this.e = context.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f080632);
        this.c = th0;
    }

    @Override // defpackage.InterfaceC7471lu0
    public final int h() {
        return this.e;
    }

    public static void k(PropertyModel propertyModel, C5726gp3 c5726gp3) {
        propertyModel.o(AbstractC0240Bw.a, c5726gp3);
    }

    @Override // defpackage.InterfaceC7444lp3
    public void b(final int i, final AutocompleteMatch autocompleteMatch, PropertyModel propertyModel) {
        propertyModel.o(AbstractC0240Bw.e, new Runnable() { // from class: tw
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC12286zw.this.j(autocompleteMatch, i);
            }
        });
        propertyModel.o(AbstractC0240Bw.f, new Runnable() { // from class: uw
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC12286zw abstractC12286zw = AbstractC12286zw.this;
                abstractC12286zw.getClass();
                AutocompleteMatch autocompleteMatch2 = autocompleteMatch;
                String str = autocompleteMatch2.d;
                final C1245Jp c1245Jp = (C1245Jp) abstractC12286zw.b;
                c1245Jp.getClass();
                final int i2 = i;
                c1245Jp.l(autocompleteMatch2, str, new Runnable() { // from class: Gp
                    @Override // java.lang.Runnable
                    public final void run() {
                        AutocompleteController autocompleteController = C1245Jp.this.w;
                        if (autocompleteController.b == 0) {
                            return;
                        }
                        AutocompleteResult autocompleteResult = autocompleteController.c;
                        int i3 = i2;
                        if (autocompleteResult.a(i3, 3)) {
                            N.Mji1IuFV(autocompleteController.b, i3);
                        }
                    }
                });
            }
        });
        propertyModel.o(AbstractC0240Bw.c, new Runnable() { // from class: vw
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC12286zw abstractC12286zw = AbstractC12286zw.this;
                abstractC12286zw.getClass();
                String str = autocompleteMatch.i;
                C1245Jp c1245Jp = (C1245Jp) abstractC12286zw.b;
                if (c1245Jp.I) {
                    return;
                }
                c1245Jp.I = true;
                ((a) c1245Jp.g).o(str);
            }
        });
        propertyModel.o(AbstractC0240Bw.b, null);
    }

    public static boolean i(C7788mp3 c7788mp3, List list) {
        int i;
        if (list == null) {
            return false;
        }
        boolean z = false;
        for (int i2 = 0; i2 < list.size(); i2++) {
            C11901yp c11901yp = (C11901yp) list.get(i2);
            if ((c11901yp.b & 2) == 2) {
                if (i2 == list.size() - 1) {
                    i = c7788mp3.length();
                } else {
                    i = ((C11901yp) list.get(i2 + 1)).a;
                }
                c7788mp3.setSpan(new StyleSpan(1), Math.min(c11901yp.a, c7788mp3.length()), Math.min(i, c7788mp3.length()), 33);
                z = true;
            }
        }
        return z;
    }

    public void j(AutocompleteMatch autocompleteMatch, int i) {
        ((C1245Jp) this.b).g(i, autocompleteMatch, autocompleteMatch.j);
    }

    public final void l(final int i, final AutocompleteMatch autocompleteMatch, PropertyModel propertyModel) {
        String string;
        Runnable runnable;
        int i2;
        boolean z = autocompleteMatch.u;
        Context context = this.a;
        if (z) {
            string = context.getResources().getString(R.string.0_resource_name_obfuscated_res_0x7f140155);
            runnable = new Runnable() { // from class: ww
                @Override // java.lang.Runnable
                public final void run() {
                    int d;
                    C1245Jp c1245Jp = (C1245Jp) AbstractC12286zw.this.b;
                    long j = c1245Jp.w.b;
                    int i3 = i;
                    TabModel tabModel = null;
                    Tab tab = j == 0 ? null : (Tab) N.MUCLrey4(j, i3);
                    boolean z2 = false;
                    if (tab != null) {
                        InterfaceC0079Ap3 interfaceC0079Ap3 = c1245Jp.p;
                        if (interfaceC0079Ap3.i()) {
                            if (tab.m().q() == 5 || tab.m().q() == 6) {
                                c1245Jp.o.onResult(tab);
                            } else {
                                DD3 dd3 = (DD3) interfaceC0079Ap3.get();
                                int i4 = 0;
                                while (true) {
                                    ArrayList arrayList = dd3.i;
                                    if (i4 >= arrayList.size()) {
                                        break;
                                    }
                                    InterfaceC10590uz3 interfaceC10590uz3 = (InterfaceC10590uz3) arrayList.get(i4);
                                    if (interfaceC10590uz3 != null) {
                                        TabModel k = ((AbstractC11276wz3) interfaceC10590uz3).k(tab.getId());
                                        if (k != null) {
                                            tabModel = k;
                                            break;
                                        }
                                    }
                                    i4++;
                                }
                                if (tabModel != null && (d = AbstractC1558Lz3.d(tabModel, tab.getId())) != -1) {
                                    tabModel.q(d, 4, false);
                                }
                            }
                            z2 = true;
                        }
                    }
                    AutocompleteMatch autocompleteMatch2 = autocompleteMatch;
                    if (z2) {
                        c1245Jp.j(i3, 10, autocompleteMatch2);
                    } else {
                        c1245Jp.g(i3, autocompleteMatch2, autocompleteMatch2.j);
                    }
                }
            };
            i2 = R.drawable.0_resource_name_obfuscated_res_0x7f0904a9;
        } else {
            string = context.getResources().getString(R.string.0_resource_name_obfuscated_res_0x7f14014b, autocompleteMatch.i);
            runnable = new Runnable() { // from class: xw
                @Override // java.lang.Runnable
                public final void run() {
                    C1245Jp c1245Jp = (C1245Jp) AbstractC12286zw.this.b;
                    c1245Jp.m(false);
                    AutocompleteMatch autocompleteMatch2 = autocompleteMatch;
                    boolean z2 = autocompleteMatch2.c;
                    C5809h34 c5809h34 = (C5809h34) c1245Jp.h;
                    boolean isEmpty = TextUtils.isEmpty(c5809h34.b());
                    String str = autocompleteMatch2.i;
                    if (z2) {
                        str = TextUtils.concat(str, " ").toString();
                    }
                    ((a) c1245Jp.g).o(str);
                    c1245Jp.h(c5809h34.b(), c5809h34.a());
                    if (z2) {
                        c1245Jp.B |= isEmpty ? 1 : 2;
                        FI2.a("MobileOmniboxRefineSuggestion.Search");
                    } else {
                        FI2.a("MobileOmniboxRefineSuggestion.Url");
                    }
                }
            };
            i2 = R.drawable.0_resource_name_obfuscated_res_0x7f0900d5;
        }
        C5382fp3 c = C5382fp3.c(context, i2);
        c.d = true;
        c.b = true;
        propertyModel.o(AbstractC0240Bw.b, Arrays.asList(new C0110Aw(c.a(), string, (String) null, runnable)));
    }
}
