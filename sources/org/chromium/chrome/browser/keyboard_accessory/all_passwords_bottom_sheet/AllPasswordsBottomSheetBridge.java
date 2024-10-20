package org.chromium.chrome.browser.keyboard_accessory.all_passwords_bottom_sheet;

import J.N;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SearchView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.android.chrome.R;
import defpackage.AD2;
import defpackage.AbstractC10297u8;
import defpackage.AbstractC10640v8;
import defpackage.AbstractC1996Pj1;
import defpackage.C11669y8;
import defpackage.C2210Ra0;
import defpackage.C5175fD1;
import defpackage.C7272lK1;
import defpackage.C8926q8;
import defpackage.C9611s8;
import defpackage.C9954t8;
import defpackage.GD2;
import defpackage.InterfaceC8583p8;
import defpackage.JD2;
import defpackage.LD2;
import defpackage.QB;
import defpackage.TD2;
import defpackage.UB;
import defpackage.UD2;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Locale;
import java.util.Objects;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.keyboard_accessory.all_passwords_bottom_sheet.AllPasswordsBottomSheetBridge;
import org.chromium.components.browser_ui.bottomsheet.m;
import org.chromium.components.browser_ui.widget.chips.ChipView;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.ui.modelutil.PropertyModel;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class AllPasswordsBottomSheetBridge implements InterfaceC8583p8 {
    public long a;
    public C2210Ra0[] b;
    public final C8926q8 c;

    public AllPasswordsBottomSheetBridge(long j, WindowAndroid windowAndroid, String str) {
        this.a = j;
        C8926q8 c8926q8 = new C8926q8();
        this.c = c8926q8;
        Context context = (Context) windowAndroid.k().get();
        QB a = UB.a(windowAndroid);
        final C9954t8 c9954t8 = c8926q8.a;
        Objects.requireNonNull(c9954t8);
        Callback callback = new Callback() { // from class: m8
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                C9954t8 c9954t82 = C9954t8.this;
                PropertyModel propertyModel = c9954t82.b;
                LD2 ld2 = AbstractC10640v8.a;
                if (propertyModel.j(ld2)) {
                    c9954t82.b.k(ld2, false);
                    long j2 = ((AllPasswordsBottomSheetBridge) c9954t82.a).a;
                    if (j2 != 0) {
                        N.M0obhfYM(j2);
                    }
                }
            }
        };
        Callback callback2 = new Callback() { // from class: n8
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            /*  JADX ERROR: Method code generation error
                java.lang.NullPointerException
                */
            @Override // org.chromium.base.Callback
            public final void onResult(java.lang.Object r10) {
                /*
                    r9 = this;
                    java.lang.String r10 = (java.lang.String) r10
                    t8 r0 = defpackage.C9954t8.this
                    org.chromium.ui.modelutil.PropertyModel r1 = r0.b
                    JD2 r2 = defpackage.AbstractC10640v8.c
                    java.lang.Object r1 = r1.i(r2)
                    fD1 r1 = (defpackage.C5175fD1) r1
                    r1.clear()
                    Ra0[] r2 = r0.c
                    int r3 = r2.length
                    r4 = 0
                    r5 = r4
                L16:
                    if (r5 >= r3) goto L6e
                    r6 = r2[r5]
                    java.lang.String r7 = r6.b
                    boolean r7 = r7.isEmpty()
                    if (r7 == 0) goto L26
                    boolean r7 = r0.d
                    if (r7 != 0) goto L6b
                L26:
                    if (r10 == 0) goto L54
                    java.util.Locale r7 = java.util.Locale.ENGLISH
                    java.lang.String r8 = r6.d
                    java.lang.String r8 = r8.toLowerCase(r7)
                    java.lang.String r7 = r10.toLowerCase(r7)
                    boolean r7 = r8.contains(r7)
                    if (r7 != 0) goto L54
                    java.util.Locale r7 = java.util.Locale.getDefault()
                    java.lang.String r8 = r6.a
                    java.lang.String r7 = r8.toLowerCase(r7)
                    java.util.Locale r8 = java.util.Locale.getDefault()
                    java.lang.String r8 = r10.toLowerCase(r8)
                    boolean r7 = r7.contains(r8)
                    if (r7 != 0) goto L54
                    r7 = 1
                    goto L55
                L54:
                    r7 = r4
                L55:
                    if (r7 == 0) goto L58
                    goto L6b
                L58:
                    s8 r7 = new s8
                    r7.<init>(r0)
                    boolean r8 = r0.d
                    org.chromium.ui.modelutil.PropertyModel r6 = defpackage.AbstractC10297u8.a(r6, r7, r8)
                    lK1 r7 = new lK1
                    r7.<init>(r4, r6)
                    r1.s(r7)
                L6b:
                    int r5 = r5 + 1
                    goto L16
                L6e:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.C7896n8.onResult(java.lang.Object):void");
            }
        };
        HashMap e = PropertyModel.e(AbstractC10640v8.f);
        LD2 ld2 = AbstractC10640v8.a;
        AD2 ad2 = new AD2();
        ad2.a = false;
        e.put(ld2, ad2);
        JD2 jd2 = AbstractC10640v8.c;
        C5175fD1 c5175fD1 = new C5175fD1();
        GD2 gd2 = new GD2();
        gd2.a = c5175fD1;
        e.put(jd2, gd2);
        JD2 jd22 = AbstractC10640v8.b;
        GD2 gd22 = new GD2();
        gd22.a = callback;
        e.put(jd22, gd22);
        JD2 jd23 = AbstractC10640v8.d;
        GD2 gd23 = new GD2();
        gd23.a = str;
        e.put(jd23, gd23);
        JD2 jd24 = AbstractC10640v8.e;
        GD2 gd24 = new GD2();
        gd24.a = callback2;
        PropertyModel a2 = AbstractC1996Pj1.a(e, jd24, gd24, e);
        c9954t8.a = this;
        c9954t8.b = a2;
        UD2.a(a2, new C11669y8(context, a), new TD2() { // from class: o8
            @Override // defpackage.TD2
            public final void d(WD2 wd2, Object obj, Object obj2) {
                PropertyModel propertyModel = (PropertyModel) wd2;
                C11669y8 c11669y8 = (C11669y8) obj;
                FD2 fd2 = (FD2) obj2;
                JD2 jd25 = AbstractC10640v8.b;
                if (fd2 != jd25) {
                    LD2 ld22 = AbstractC10640v8.a;
                    if (fd2 == ld22) {
                        boolean j2 = propertyModel.j(ld22);
                        QB qb = c11669y8.a;
                        if (j2) {
                            m mVar = (m) qb;
                            C10983w8 c10983w8 = c11669y8.j;
                            mVar.a(c10983w8);
                            if (mVar.p(c11669y8, true)) {
                                return;
                            }
                            c11669y8.g.onResult(0);
                            mVar.o(c10983w8);
                            return;
                        }
                        ((m) qb).l(c11669y8, true, 0);
                        return;
                    }
                    JD2 jd26 = AbstractC10640v8.d;
                    if (fd2 == jd26) {
                        String format = String.format(c11669y8.i.getResources().getString(AbstractC0193Bm2.l() ? R.string.0_resource_name_obfuscated_res_0x7f1401d4 : R.string.0_resource_name_obfuscated_res_0x7f1401d7), AbstractC10615v34.b(2, new GURL((String) propertyModel.i(jd26))));
                        LinearLayout linearLayout = c11669y8.i;
                        ((TextView) linearLayout.findViewById(R.id.sheet_warning)).setText(format);
                        if (AbstractC0193Bm2.l()) {
                            ((TextView) linearLayout.findViewById(R.id.sheet_warning_second)).setVisibility(8);
                            return;
                        }
                        return;
                    }
                    JD2 jd27 = AbstractC10640v8.e;
                    if (fd2 != jd27) {
                        JD2 jd28 = AbstractC10640v8.c;
                        if (fd2 == jd28) {
                            c11669y8.h.n0(new RK2(new C5648gc3((C5175fD1) propertyModel.i(jd28), new InterfaceC5992hc3() { // from class: z8
                                @Override // defpackage.InterfaceC5992hc3
                                public final int a(Object obj3) {
                                    return ((C7272lK1) obj3).a;
                                }
                            }, new InterfaceC5304fc3() { // from class: A8
                                @Override // defpackage.InterfaceC5304fc3
                                public final void a(Object obj3, Object obj4) {
                                    G8 g8 = (G8) obj3;
                                    new UD2(((C7272lK1) obj4).b, g8.a, g8.z, true);
                                }
                            }), new QK2() { // from class: B8
                                /* JADX WARN: Type inference failed for: r0v0, types: [C8] */
                                @Override // defpackage.QK2
                                public final Object a(int i, RecyclerView recyclerView) {
                                    if (i != 0) {
                                        return null;
                                    }
                                    return new G8(recyclerView, new TD2() { // from class: C8
                                        @Override // defpackage.TD2
                                        public final void d(WD2 wd22, Object obj3, Object obj4) {
                                            final PropertyModel propertyModel2 = (PropertyModel) wd22;
                                            View view = (View) obj3;
                                            FD2 fd22 = (FD2) obj4;
                                            JD2 jd29 = AbstractC10297u8.a;
                                            final C2210Ra0 c2210Ra0 = (C2210Ra0) propertyModel2.i(jd29);
                                            JD2 jd210 = AbstractC10297u8.b;
                                            HD2 hd2 = AbstractC10297u8.c;
                                            if (fd22 == jd210) {
                                                boolean j3 = propertyModel2.j(hd2);
                                                ChipView chipView = (ChipView) view.findViewById(R.id.suggestion_text);
                                                ChipView chipView2 = (ChipView) view.findViewById(R.id.password_text);
                                                if (!j3) {
                                                    chipView.setOnClickListener(c2210Ra0.a.isEmpty() ? null : new View.OnClickListener() { // from class: E8
                                                        @Override // android.view.View.OnClickListener
                                                        public final void onClick(View view2) {
                                                            ((Callback) PropertyModel.this.i(AbstractC10297u8.b)).onResult(c2210Ra0);
                                                        }
                                                    });
                                                    chipView.setClickable(!r11.isEmpty());
                                                    chipView2.setOnClickListener(null);
                                                    chipView2.setClickable(false);
                                                    return;
                                                }
                                                chipView2.setOnClickListener(new View.OnClickListener() { // from class: D8
                                                    @Override // android.view.View.OnClickListener
                                                    public final void onClick(View view2) {
                                                        ((Callback) PropertyModel.this.i(AbstractC10297u8.b)).onResult(c2210Ra0);
                                                    }
                                                });
                                                chipView.setOnClickListener(null);
                                                chipView.setClickable(false);
                                                return;
                                            }
                                            if (fd22 == hd2) {
                                                boolean j4 = propertyModel2.j(hd2);
                                                ChipView chipView3 = (ChipView) view.findViewById(R.id.suggestion_text);
                                                String str2 = c2210Ra0.a;
                                                chipView3.setEnabled((j4 || str2.isEmpty()) ? false : true);
                                                chipView3.setClickable((j4 || str2.isEmpty()) ? false : true);
                                                ChipView chipView4 = (ChipView) view.findViewById(R.id.password_text);
                                                chipView4.setEnabled(j4);
                                                chipView4.setClickable(j4);
                                                return;
                                            }
                                            if (fd22 == jd29) {
                                                TextView textView = (TextView) view.findViewById(R.id.password_info_title);
                                                boolean z = c2210Ra0.e;
                                                String str3 = c2210Ra0.f;
                                                String str4 = c2210Ra0.d;
                                                textView.setText(z ? str3 : AbstractC10615v34.b(2, new GURL(str4)));
                                                ((ChipView) view.findViewById(R.id.suggestion_text)).g.setText(c2210Ra0.c);
                                                ChipView chipView5 = (ChipView) view.findViewById(R.id.password_text);
                                                String str5 = c2210Ra0.b;
                                                boolean isEmpty = str5.isEmpty();
                                                if (!isEmpty) {
                                                    chipView5.g.setTransformationMethod(new PasswordTransformationMethod());
                                                }
                                                C10475ug c10475ug = chipView5.g;
                                                if (isEmpty) {
                                                    str5 = view.getContext().getString(R.string.0_resource_name_obfuscated_res_0x7f1401d2);
                                                }
                                                c10475ug.setText(str5);
                                                XH0 xh0 = new XH0(view.getContext());
                                                final ImageView imageView = (ImageView) view.findViewById(R.id.favicon);
                                                boolean z2 = c2210Ra0.e;
                                                if (!z2) {
                                                    str3 = str4;
                                                }
                                                Drawable b = xh0.b(str3);
                                                int dimensionPixelSize = imageView.getContext().getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f0803a3);
                                                b.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                                                imageView.setImageDrawable(b);
                                                if (z2) {
                                                    return;
                                                }
                                                xh0.a(new Callback() { // from class: F8
                                                    @Override // org.chromium.base.Callback
                                                    public final ZE e0(Object obj5) {
                                                        return new ZE(this, obj5);
                                                    }

                                                    @Override // org.chromium.base.Callback
                                                    public final void onResult(Object obj5) {
                                                        Drawable drawable = (Drawable) obj5;
                                                        ImageView imageView2 = imageView;
                                                        int dimensionPixelSize2 = imageView2.getContext().getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f0803a3);
                                                        if (drawable != null) {
                                                            drawable.setBounds(0, 0, dimensionPixelSize2, dimensionPixelSize2);
                                                        }
                                                        imageView2.setImageDrawable(drawable);
                                                    }
                                                }, str4);
                                            }
                                        }
                                    });
                                }
                            }));
                            return;
                        }
                        return;
                    }
                    ((SearchView) c11669y8.i.findViewById(R.id.all_passwords_search_view)).setOnQueryTextListener(new C11326x8((Callback) propertyModel.i(jd27)));
                    return;
                }
                c11669y8.g = (Callback) propertyModel.i(jd25);
            }
        });
    }

    public static AllPasswordsBottomSheetBridge create(long j, WindowAndroid windowAndroid, String str) {
        return new AllPasswordsBottomSheetBridge(j, windowAndroid, str);
    }

    public final void destroy() {
        this.a = 0L;
    }

    public final void createCredentialArray(int i) {
        this.b = new C2210Ra0[i];
    }

    public final void insertCredential(int i, String str, String str2, String str3, String str4, boolean z, String str5) {
        this.b[i] = new C2210Ra0(str, str2, str3, str4, str5, z);
    }

    public final void showCredentials(boolean z) {
        C2210Ra0[] c2210Ra0Arr = this.b;
        C9954t8 c9954t8 = this.c.a;
        c9954t8.getClass();
        Arrays.sort(c2210Ra0Arr, new Comparator() { // from class: r8
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                String b;
                String b2;
                C2210Ra0 c2210Ra0 = (C2210Ra0) obj;
                C2210Ra0 c2210Ra02 = (C2210Ra0) obj2;
                if (c2210Ra0.e) {
                    b = c2210Ra0.f.toLowerCase(Locale.ENGLISH);
                } else {
                    b = T34.b(c2210Ra0.d, false);
                }
                if (c2210Ra02.e) {
                    b2 = c2210Ra02.f.toLowerCase(Locale.ENGLISH);
                } else {
                    b2 = T34.b(c2210Ra02.d, false);
                }
                return b.compareTo(b2);
            }
        });
        c9954t8.c = c2210Ra0Arr;
        c9954t8.d = z;
        C5175fD1 c5175fD1 = (C5175fD1) c9954t8.b.i(AbstractC10640v8.c);
        c5175fD1.clear();
        for (C2210Ra0 c2210Ra0 : c9954t8.c) {
            if (!c2210Ra0.b.isEmpty() || !z) {
                c5175fD1.s(new C7272lK1(0, AbstractC10297u8.a(c2210Ra0, new C9611s8(c9954t8), c9954t8.d)));
            }
        }
        c9954t8.b.k(AbstractC10640v8.a, true);
    }
}
