package defpackage;

import J.N;
import android.content.Context;
import android.content.res.Resources;
import android.text.Spannable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.android.chrome.R;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.omnibox.a;
import org.chromium.components.browser_ui.widget.tile.TileView;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: op */
/* loaded from: classes.dex */
public final class C8472op implements InterfaceC8411oe4 {
    public ArrayList a = new ArrayList();
    public C7100kp3 b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ C7616mK1 d;
    public final /* synthetic */ C8815pp e;

    public C8472op(C8815pp c8815pp, Context context, C7616mK1 c7616mK1) {
        this.e = c8815pp;
        this.c = context;
        this.d = c7616mK1;
    }

    @Override // defpackage.InterfaceC8411oe4
    public final void b() {
        C7432ln3 c = C7432ln3.c();
        try {
            C9425rc2 c9425rc2 = new C9425rc2(this.c);
            c.close();
            c9425rc2.setVisibility(8);
            c9425rc2.setClipToPadding(false);
            C9768sc2 c9768sc2 = new C9768sc2(this.d);
            c9425rc2.n0(c9768sc2);
            c9768sc2.Q(0, new InterfaceC7960nK1() { // from class: Zo
                @Override // defpackage.InterfaceC7960nK1
                public final View a(ViewGroup viewGroup) {
                    return new C8170nw(viewGroup.getContext(), R.layout.0_resource_name_obfuscated_res_0x7f0e01ca);
                }
            }, new C9885sw(new C5378fp()));
            c9768sc2.Q(1, new InterfaceC7960nK1() { // from class: lp
                @Override // defpackage.InterfaceC7960nK1
                public final View a(ViewGroup viewGroup) {
                    return new C4047bw0(viewGroup.getContext());
                }
            }, new C4390cw0());
            c9768sc2.Q(2, new InterfaceC7960nK1() { // from class: mp
                @Override // defpackage.InterfaceC7960nK1
                public final View a(ViewGroup viewGroup) {
                    return new C8170nw(viewGroup.getContext(), R.layout.0_resource_name_obfuscated_res_0x7f0e01c9);
                }
            }, new C9885sw(new TD2() { // from class: np
                @Override // defpackage.TD2
                public final void d(WD2 wd2, Object obj, Object obj2) {
                    PropertyModel propertyModel = (PropertyModel) wd2;
                    View view = (View) obj;
                    FD2 fd2 = (FD2) obj2;
                    PD2 pd2 = AbstractC1959Pc.b;
                    if (pd2 == fd2) {
                        ((TextView) view.findViewById(R.id.omnibox_answer_line_1)).setText((CharSequence) propertyModel.i(pd2));
                        return;
                    }
                    PD2 pd22 = AbstractC1959Pc.e;
                    if (pd22 == fd2) {
                        ((TextView) view.findViewById(R.id.omnibox_answer_line_2)).setText((CharSequence) propertyModel.i(pd22));
                        return;
                    }
                    PD2 pd23 = AbstractC1959Pc.c;
                    if (pd23 == fd2) {
                        ((TextView) view.findViewById(R.id.omnibox_answer_line_1)).setContentDescription((CharSequence) propertyModel.i(pd23));
                        return;
                    }
                    PD2 pd24 = AbstractC1959Pc.f;
                    if (pd24 == fd2) {
                        ((TextView) view.findViewById(R.id.omnibox_answer_line_2)).setContentDescription((CharSequence) propertyModel.i(pd24));
                        return;
                    }
                    ND2 nd2 = AbstractC1959Pc.a;
                    if (nd2 == fd2) {
                        ((TextView) view.findViewById(R.id.omnibox_answer_line_1)).setMaxLines(propertyModel.h(nd2));
                        return;
                    }
                    ND2 nd22 = AbstractC1959Pc.d;
                    if (nd22 == fd2) {
                        ((TextView) view.findViewById(R.id.omnibox_answer_line_2)).setMaxLines(propertyModel.h(nd22));
                    }
                }
            }));
            c9768sc2.Q(3, new InterfaceC7960nK1() { // from class: ap
                @Override // defpackage.InterfaceC7960nK1
                public final View a(ViewGroup viewGroup) {
                    return new C8170nw(viewGroup.getContext(), R.layout.0_resource_name_obfuscated_res_0x7f0e01cb);
                }
            }, new C9885sw(new TD2() { // from class: bp
                @Override // defpackage.TD2
                public final void d(WD2 wd2, Object obj, Object obj2) {
                    PropertyModel propertyModel = (PropertyModel) wd2;
                    View view = (View) obj;
                    FD2 fd2 = (FD2) obj2;
                    PD2 pd2 = AbstractC4825eC0.a;
                    if (pd2 == fd2) {
                        ((TextView) view.findViewById(R.id.entity_subject)).setText((CharSequence) propertyModel.i(pd2));
                        return;
                    }
                    PD2 pd22 = AbstractC4825eC0.b;
                    if (pd22 == fd2) {
                        TextView textView = (TextView) view.findViewById(R.id.entity_description);
                        if (TextUtils.isEmpty((String) propertyModel.i(pd22))) {
                            textView.setVisibility(8);
                        } else {
                            textView.setVisibility(0);
                            textView.setText((CharSequence) propertyModel.i(pd22));
                        }
                    }
                }
            }));
            c9768sc2.Q(4, new InterfaceC7960nK1() { // from class: cp
                @Override // defpackage.InterfaceC7960nK1
                public final View a(ViewGroup viewGroup) {
                    return new C8170nw(new OE3(viewGroup.getContext()));
                }
            }, new C9885sw(new TD2() { // from class: dp
                @Override // defpackage.TD2
                public final void d(WD2 wd2, Object obj, Object obj2) {
                    PropertyModel propertyModel = (PropertyModel) wd2;
                    OE3 oe3 = (OE3) obj;
                    FD2 fd2 = (FD2) obj2;
                    PD2 pd2 = PE3.c;
                    if (pd2 == fd2) {
                        C6520j8 c6520j8 = (C6520j8) propertyModel.i(pd2);
                        oe3.a = c6520j8;
                        c6520j8.a.add(oe3);
                        return;
                    }
                    PD2 pd22 = PE3.a;
                    if (fd2 == pd22) {
                        Spannable spannable = (Spannable) propertyModel.i(pd22);
                        oe3.h = (int) oe3.getPaint().measureText(spannable, 0, spannable.length());
                        oe3.setText(spannable);
                        return;
                    }
                    PD2 pd23 = PE3.b;
                    if (fd2 == pd23) {
                        String str = (String) propertyModel.i(pd23);
                        oe3.g = (int) oe3.getPaint().measureText(str, 0, str.length());
                    } else {
                        ND2 nd2 = AbstractC5038ep3.a;
                        if (fd2 == nd2) {
                            oe3.setTextColor(AbstractC5647gc2.b(oe3.getContext(), propertyModel.h(nd2)));
                        }
                    }
                }
            }));
            c9768sc2.Q(5, new InterfaceC7960nK1() { // from class: ep
                @Override // defpackage.InterfaceC7960nK1
                public final View a(ViewGroup viewGroup) {
                    return new C8170nw(viewGroup.getContext(), R.layout.0_resource_name_obfuscated_res_0x7f0e01ca);
                }
            }, new C9885sw(new C5378fp()));
            c9768sc2.Q(7, new InterfaceC7960nK1() { // from class: gp
                @Override // defpackage.InterfaceC7960nK1
                public final View a(ViewGroup viewGroup) {
                    C4617dc3 c4617dc3 = new C4617dc3(new C7616mK1());
                    c4617dc3.Q(0, new InterfaceC7960nK1() { // from class: lu
                        @Override // defpackage.InterfaceC7960nK1
                        public final View a(ViewGroup viewGroup2) {
                            TileView tileView = (TileView) LayoutInflater.from(viewGroup2.getContext()).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e0289, viewGroup2, false);
                            tileView.setClickable(true);
                            tileView.setBackgroundDrawable(AbstractC5647gc2.e(0, R.attr.0_resource_name_obfuscated_res_0x7f0503f1, viewGroup2.getContext()));
                            return tileView;
                        }
                    }, new C7814mu());
                    return new C9188qu(viewGroup.getContext(), c4617dc3);
                }
            }, new TD2() { // from class: hp
                @Override // defpackage.TD2
                public final void d(WD2 wd2, Object obj, Object obj2) {
                    PropertyModel propertyModel = (PropertyModel) wd2;
                    C9188qu c9188qu = (C9188qu) obj;
                    FD2 fd2 = (FD2) obj2;
                    PD2 pd2 = AbstractC9530ru.a;
                    if (fd2 == pd2) {
                        List list = (List) propertyModel.i(pd2);
                        C4617dc3 c4617dc3 = (C4617dc3) c9188qu.g.r;
                        if (list != null) {
                            c4617dc3.i.A(list);
                            return;
                        } else {
                            c4617dc3.i.clear();
                            return;
                        }
                    }
                    PD2 pd22 = AbstractC9530ru.b;
                    if (fd2 == pd22) {
                        c9188qu.a.a.setText((CharSequence) propertyModel.i(pd22));
                        return;
                    }
                    LD2 ld2 = AbstractC9530ru.c;
                    int i = 0;
                    if (fd2 == ld2) {
                        boolean j = propertyModel.j(ld2);
                        C8236o71 c8236o71 = c9188qu.a;
                        int dimensionPixelSize = c9188qu.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f08061b);
                        if (j) {
                            c8236o71.setVisibility(0);
                            c9188qu.setPaddingRelative(0, 0, 0, dimensionPixelSize);
                            return;
                        } else {
                            c8236o71.setVisibility(8);
                            c9188qu.setPaddingRelative(0, dimensionPixelSize, 0, dimensionPixelSize);
                            return;
                        }
                    }
                    ND2 nd2 = AbstractC5038ep3.c;
                    if (fd2 == nd2) {
                        int h = propertyModel.h(nd2);
                        Resources resources = c9188qu.getResources();
                        C7928nE c7928nE = UN.a;
                        if (!N.M09VlOh_("OmniboxMostVisitedTilesDynamicSpacing")) {
                            i = resources.getDimensionPixelOffset(R.dimen.0_resource_name_obfuscated_res_0x7f080628) * 2;
                        } else if (resources.getConfiguration().orientation == 2) {
                            i = resources.getDimensionPixelOffset(R.dimen.0_resource_name_obfuscated_res_0x7f0807f6);
                        } else {
                            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f0807f5);
                            if (h == 1) {
                                i = Math.max(-resources.getDimensionPixelOffset(R.dimen.0_resource_name_obfuscated_res_0x7f0807f4), (int) (((resources.getDisplayMetrics().widthPixels - dimensionPixelSize2) - (resources.getDimensionPixelOffset(R.dimen.0_resource_name_obfuscated_res_0x7f0807f8) * 4.5d)) / 4.0d));
                            } else if (h == 2) {
                                i = dimensionPixelSize2;
                            }
                        }
                        c9188qu.i = i;
                        c9188qu.g.requestLayout();
                    }
                }
            });
            c9768sc2.Q(6, new InterfaceC7960nK1() { // from class: ip
                @Override // defpackage.InterfaceC7960nK1
                public final View a(ViewGroup viewGroup) {
                    return new C8236o71(viewGroup.getContext());
                }
            }, new TD2() { // from class: jp
                @Override // defpackage.TD2
                public final void d(WD2 wd2, Object obj, Object obj2) {
                    PropertyModel propertyModel = (PropertyModel) wd2;
                    C8236o71 c8236o71 = (C8236o71) obj;
                    FD2 fd2 = (FD2) obj2;
                    PD2 pd2 = AbstractC9264r71.c;
                    if (pd2 == fd2) {
                        c8236o71.a.setText((CharSequence) propertyModel.i(pd2));
                        return;
                    }
                    ND2 nd2 = AbstractC5038ep3.a;
                    if (fd2 == nd2) {
                        int i = propertyModel.h(nd2) == 2 ? 1 : 0;
                        c8236o71.a.setTextAppearance(i != 0 ? R.style.f102930_resource_name_obfuscated_res_0x7f150462 : R.style.f102910_resource_name_obfuscated_res_0x7f150460);
                        c8236o71.g.setImageTintList(Y50.b(c8236o71.getContext(), i != 0 ? R.color.0_resource_name_obfuscated_res_0x7f070122 : R.color.0_resource_name_obfuscated_res_0x7f07012b));
                        return;
                    }
                    ND2 nd22 = AbstractC5038ep3.b;
                    if (fd2 == nd22) {
                        int h = propertyModel.h(nd22);
                        WeakHashMap weakHashMap = Ec4.a;
                        c8236o71.setLayoutDirection(h);
                        return;
                    }
                    LD2 ld2 = AbstractC9264r71.b;
                    if (fd2 == ld2) {
                        boolean j = propertyModel.j(ld2);
                        c8236o71.g.setImageResource(j ? R.drawable.0_resource_name_obfuscated_res_0x7f090201 : R.drawable.0_resource_name_obfuscated_res_0x7f090200);
                        c8236o71.h = j;
                        return;
                    }
                    PD2 pd22 = AbstractC9264r71.a;
                    if (fd2 == pd22) {
                        final C7204l71 c7204l71 = (C7204l71) propertyModel.i(pd22);
                        if (c7204l71 != null) {
                            c8236o71.setOnClickListener(new View.OnClickListener() { // from class: p71
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    C7204l71 c7204l712 = C7204l71.this;
                                    c7204l712.getClass();
                                    LD2 ld22 = AbstractC9264r71.b;
                                    PropertyModel propertyModel2 = c7204l712.a;
                                    boolean z = !propertyModel2.j(ld22);
                                    String str = z ? "Omnibox.ToggleSuggestionGroupId.Off" : "Omnibox.ToggleSuggestionGroupId.On";
                                    int i2 = c7204l712.b;
                                    EI2.m(i2, str);
                                    propertyModel2.k(ld22, z);
                                    C9531ru0 c9531ru0 = ((C1245Jp) c7204l712.c.a).n;
                                    int i3 = 0;
                                    if (c9531ru0.c.get(i2, false) == z) {
                                        return;
                                    }
                                    c9531ru0.c.put(i2, z);
                                    C7616mK1 c7616mK1 = c9531ru0.b;
                                    if (z) {
                                        int size = c7616mK1.size() - 1;
                                        while (size >= 0) {
                                            C7815mu0 c7815mu0 = (C7815mu0) c7616mK1.get(size);
                                            if (C9531ru0.a(c7815mu0, i2)) {
                                                break;
                                            }
                                            int i4 = c7815mu0.c;
                                            if (i4 != i2) {
                                                if (i3 > 0 && i4 != i2) {
                                                    break;
                                                }
                                            } else {
                                                i3++;
                                            }
                                            size--;
                                        }
                                        if (i3 > 0) {
                                            c7616mK1.z(size + 1, i3);
                                            return;
                                        }
                                        return;
                                    }
                                    int i5 = 0;
                                    while (i5 < c7616mK1.size() && !C9531ru0.a((C7815mu0) c7616mK1.get(i5), i2)) {
                                        i5++;
                                    }
                                    if (i5 == c7616mK1.size()) {
                                        return;
                                    }
                                    int i6 = i5 + 1;
                                    if (i6 >= c7616mK1.size() || ((C7815mu0) c7616mK1.get(i6)).c != i2) {
                                        int i7 = -1;
                                        int i8 = 0;
                                        while (i3 < c9531ru0.f.size()) {
                                            C7815mu0 c7815mu02 = (C7815mu0) c9531ru0.f.get(i3);
                                            if (!C9531ru0.a(c7815mu02, i2)) {
                                                int i9 = c7815mu02.c;
                                                if (i9 != i2) {
                                                    if (i8 > 0 && i9 != i2) {
                                                        break;
                                                    }
                                                } else {
                                                    i8++;
                                                }
                                            } else {
                                                i7 = i3 + 1;
                                            }
                                            i3++;
                                        }
                                        if (i8 == 0 || i7 == -1) {
                                            return;
                                        }
                                        c7616mK1.u(i6, c9531ru0.f.subList(i7, i8 + i7));
                                    }
                                }
                            });
                            c8236o71.i = new Runnable() { // from class: q71
                                @Override // java.lang.Runnable
                                public final void run() {
                                    ((a) C7204l71.this.c.b).o(null);
                                }
                            };
                            return;
                        } else {
                            c8236o71.setOnClickListener(null);
                            c8236o71.i = null;
                            return;
                        }
                    }
                    LD2 ld22 = AbstractC9264r71.d;
                    if (fd2 == ld22) {
                        c8236o71.g.setVisibility(propertyModel.j(ld22) ? 8 : 0);
                    }
                }
            });
            c9768sc2.Q(8, new InterfaceC7960nK1() { // from class: kp
                @Override // defpackage.InterfaceC7960nK1
                public final View a(ViewGroup viewGroup) {
                    return new C2552Tq2(viewGroup.getContext());
                }
            }, new C2682Uq2(new C5378fp()));
            this.b = new C7100kp3((ViewGroup) ((ViewStub) this.e.a.getRootView().findViewById(R.id.omnibox_results_container_stub)).inflate(), c9425rc2);
            for (int i = 0; i < this.a.size(); i++) {
                ((Callback) this.a.get(i)).onResult(this.b);
            }
            this.a = null;
        } catch (Throwable th) {
            try {
                c.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    @Override // defpackage.InterfaceC8411oe4
    public final void a(Callback callback) {
        C7100kp3 c7100kp3 = this.b;
        if (c7100kp3 != null) {
            callback.onResult(c7100kp3);
        } else {
            this.a.add(callback);
        }
    }
}
