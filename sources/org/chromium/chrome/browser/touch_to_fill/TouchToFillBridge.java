package org.chromium.chrome.browser.touch_to_fill;

import J.N;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.android.chrome.R;
import defpackage.AD2;
import defpackage.AbstractC0193Bm2;
import defpackage.AbstractC10065tT3;
import defpackage.AbstractC10615v34;
import defpackage.AbstractC1996Pj1;
import defpackage.AbstractC9037qT3;
import defpackage.AbstractC9379rT3;
import defpackage.AbstractC9722sT3;
import defpackage.C11780yT3;
import defpackage.C1193Je2;
import defpackage.C5175fD1;
import defpackage.C6289iT3;
import defpackage.C7272lK1;
import defpackage.C8351oT3;
import defpackage.DD2;
import defpackage.GD2;
import defpackage.HD2;
import defpackage.ID2;
import defpackage.JD2;
import defpackage.QB;
import defpackage.TD2;
import defpackage.UB;
import defpackage.UD2;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.touch_to_fill.data.Credential;
import org.chromium.chrome.browser.touch_to_fill.data.WebAuthnCredential;
import org.chromium.components.browser_ui.bottomsheet.m;
import org.chromium.components.favicon.LargeIconBridge;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.ui.modelutil.PropertyModel;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class TouchToFillBridge {
    public long a;
    public final C6289iT3 b;

    public TouchToFillBridge(long j, WindowAndroid windowAndroid, QB qb) {
        this.a = j;
        C6289iT3 c6289iT3 = new C6289iT3();
        this.b = c6289iT3;
        Context context = (Context) windowAndroid.j.get();
        PropertyModel propertyModel = c6289iT3.b;
        LargeIconBridge largeIconBridge = new LargeIconBridge(Profile.d());
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(AbstractC0193Bm2.l() ? R.dimen.f42590_resource_name_obfuscated_res_0x7f080820 : R.dimen.f42580_resource_name_obfuscated_res_0x7f08081f);
        C8351oT3 c8351oT3 = c6289iT3.a;
        c8351oT3.a = this;
        c8351oT3.b = propertyModel;
        c8351oT3.c = largeIconBridge;
        c8351oT3.d = dimensionPixelSize;
        UD2.a(propertyModel, new C11780yT3(context, qb), new TD2() { // from class: gT3
            @Override // defpackage.TD2
            public final void d(WD2 wd2, Object obj, Object obj2) {
                PropertyModel propertyModel2 = (PropertyModel) wd2;
                C11780yT3 c11780yT3 = (C11780yT3) obj;
                FD2 fd2 = (FD2) obj2;
                JD2 jd2 = AbstractC10065tT3.c;
                if (fd2 != jd2) {
                    LD2 ld2 = AbstractC10065tT3.a;
                    if (fd2 == ld2) {
                        boolean j2 = propertyModel2.j(ld2);
                        QB qb2 = c11780yT3.a;
                        boolean z = true;
                        if (j2) {
                            c11780yT3.z(false);
                            m mVar = (m) qb2;
                            C10751vT3 c10751vT3 = c11780yT3.j;
                            mVar.a(c10751vT3);
                            if (!mVar.p(c11780yT3, true)) {
                                mVar.o(c10751vT3);
                                z = false;
                            }
                        } else {
                            ((m) qb2).l(c11780yT3, true, 0);
                        }
                        if (z || !propertyModel2.j(ld2)) {
                            return;
                        }
                        ((Callback) propertyModel2.i(jd2)).onResult(0);
                        return;
                    }
                    PD2 pd2 = AbstractC10065tT3.d;
                    if (fd2 == pd2) {
                        final Runnable runnable = (Runnable) propertyModel2.i(pd2);
                        c11780yT3.h.findViewById(R.id.touch_to_fill_sheet_manage_passwords).setOnClickListener(new View.OnClickListener() { // from class: uT3
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                runnable.run();
                            }
                        });
                        return;
                    }
                    JD2 jd22 = AbstractC10065tT3.b;
                    if (fd2 == jd22) {
                        c11780yT3.g.n0(new RK2(new C5648gc3((C5175fD1) propertyModel2.i(jd22), new InterfaceC5992hc3() { // from class: zT3
                            @Override // defpackage.InterfaceC5992hc3
                            public final int a(Object obj3) {
                                return ((C7272lK1) obj3).a;
                            }
                        }, new InterfaceC5304fc3() { // from class: AT3
                            @Override // defpackage.InterfaceC5304fc3
                            public final void a(Object obj3, Object obj4) {
                                JT3 jt3 = (JT3) obj3;
                                new UD2(((C7272lK1) obj4).b, jt3.a, jt3.z, true);
                            }
                        }), new QK2() { // from class: BT3
                            @Override // defpackage.QK2
                            public final Object a(int i, RecyclerView recyclerView) {
                                if (i == 1) {
                                    return new JT3(recyclerView, AbstractC0193Bm2.l() ? R.layout.f61740_resource_name_obfuscated_res_0x7f0e02d2 : R.layout.f61730_resource_name_obfuscated_res_0x7f0e02d1, new TD2() { // from class: CT3
                                        @Override // defpackage.TD2
                                        public final void d(WD2 wd22, Object obj3, Object obj4) {
                                            String string;
                                            String format;
                                            PropertyModel propertyModel3 = (PropertyModel) wd22;
                                            View view = (View) obj3;
                                            FD2 fd22 = (FD2) obj4;
                                            HD2 hd2 = AbstractC9379rT3.a;
                                            ID2 id2 = AbstractC9379rT3.e;
                                            JD2 jd23 = AbstractC9379rT3.c;
                                            HD2 hd22 = AbstractC9379rT3.d;
                                            HD2 hd23 = AbstractC9379rT3.b;
                                            if (fd22 == hd2 || fd22 == hd23 || fd22 == jd23 || fd22 == hd22 || fd22 == id2) {
                                                TextView textView = (TextView) view.findViewById(R.id.touch_to_fill_sheet_title);
                                                Context context2 = view.getContext();
                                                if (N.Mudil8Bg("WebAuthenticationConditionalUI")) {
                                                    string = context2.getString(R.string.f89290_resource_name_obfuscated_res_0x7f140b45);
                                                } else {
                                                    C7928nE c7928nE = UN.a;
                                                    if (N.M09VlOh_("TouchToFillPasswordSubmission") || AbstractC0193Bm2.l()) {
                                                        string = context2.getString(R.string.f89360_resource_name_obfuscated_res_0x7f140b4c);
                                                    } else {
                                                        string = context2.getString(propertyModel3.j(hd23) ? R.string.f89350_resource_name_obfuscated_res_0x7f140b4b : R.string.f89340_resource_name_obfuscated_res_0x7f140b4a);
                                                    }
                                                }
                                                textView.setText(string);
                                                TextView textView2 = (TextView) view.findViewById(R.id.touch_to_fill_sheet_subtitle);
                                                Context context3 = view.getContext();
                                                if (propertyModel3.j(hd2)) {
                                                    format = String.format(context3.getString(propertyModel3.j(hd22) ? R.string.f89330_resource_name_obfuscated_res_0x7f140b49 : R.string.f89310_resource_name_obfuscated_res_0x7f140b47), propertyModel3.i(jd23));
                                                } else if (propertyModel3.j(hd22)) {
                                                    format = (String) propertyModel3.i(jd23);
                                                } else {
                                                    format = String.format(context3.getString(R.string.f89320_resource_name_obfuscated_res_0x7f140b48), propertyModel3.i(jd23));
                                                }
                                                textView2.setText(format);
                                                ((ImageView) view.findViewById(R.id.touch_to_fill_sheet_header_image)).setImageDrawable(AbstractC2884Wf.a(view.getContext(), AbstractC0193Bm2.l() ? R.drawable.f49900_resource_name_obfuscated_res_0x7f0902f3 : propertyModel3.h(id2)));
                                            }
                                        }
                                    });
                                }
                                if (i == 2) {
                                    return new JT3(recyclerView, AbstractC0193Bm2.l() ? R.layout.f61700_resource_name_obfuscated_res_0x7f0e02ce : R.layout.f61690_resource_name_obfuscated_res_0x7f0e02cd, new TD2() { // from class: DT3
                                        @Override // defpackage.TD2
                                        public final void d(WD2 wd22, Object obj3, Object obj4) {
                                            final PropertyModel propertyModel3 = (PropertyModel) wd22;
                                            View view = (View) obj3;
                                            FD2 fd22 = (FD2) obj4;
                                            JD2 jd23 = AbstractC9037qT3.b;
                                            final Credential credential = (Credential) propertyModel3.i(jd23);
                                            PD2 pd22 = AbstractC9037qT3.a;
                                            if (fd22 == pd22) {
                                                ImageView imageView = (ImageView) view.findViewById(R.id.favicon);
                                                C8694pT3 c8694pT3 = (C8694pT3) propertyModel3.i(pd22);
                                                imageView.setImageDrawable(AbstractC4855eI0.d(c8694pT3.b, c8694pT3.a, c8694pT3.c, AbstractC4855eI0.a(view.getContext()), view.getResources(), c8694pT3.d));
                                                return;
                                            }
                                            if (fd22 == AbstractC9037qT3.e) {
                                                view.setOnClickListener(new View.OnClickListener() { // from class: GT3
                                                    @Override // android.view.View.OnClickListener
                                                    public final void onClick(View view2) {
                                                        ((Callback) PropertyModel.this.i(AbstractC9037qT3.e)).onResult(credential);
                                                    }
                                                });
                                                return;
                                            }
                                            JD2 jd24 = AbstractC9037qT3.c;
                                            if (fd22 == jd24) {
                                                TextView textView = (TextView) view.findViewById(R.id.credential_origin);
                                                textView.setText((CharSequence) propertyModel3.i(jd24));
                                                textView.setVisibility((credential.e || credential.f) ? false : true ? 8 : 0);
                                            } else if (fd22 == jd23) {
                                                TextView textView2 = (TextView) view.findViewById(R.id.credential_origin);
                                                textView2.setText(T34.o(credential.getOriginUrl()).replaceFirst("/$", ""));
                                                textView2.setVisibility((credential.e || credential.f) ? false : true ? 8 : 0);
                                                ((TextView) view.findViewById(R.id.username)).setText(credential.c);
                                                TextView textView3 = (TextView) view.findViewById(R.id.password);
                                                textView3.setText(credential.getPassword());
                                                textView3.setTransformationMethod(new PasswordTransformationMethod());
                                            }
                                        }
                                    });
                                }
                                if (i == 3) {
                                    return new JT3(recyclerView, AbstractC0193Bm2.l() ? R.layout.f61770_resource_name_obfuscated_res_0x7f0e02d5 : R.layout.f61760_resource_name_obfuscated_res_0x7f0e02d4, new TD2() { // from class: ET3
                                        @Override // defpackage.TD2
                                        public final void d(WD2 wd22, Object obj3, Object obj4) {
                                            final PropertyModel propertyModel3 = (PropertyModel) wd22;
                                            View view = (View) obj3;
                                            FD2 fd22 = (FD2) obj4;
                                            JD2 jd23 = AbstractC9722sT3.a;
                                            final WebAuthnCredential webAuthnCredential = (WebAuthnCredential) propertyModel3.i(jd23);
                                            if (fd22 == AbstractC9722sT3.c) {
                                                view.setOnClickListener(new View.OnClickListener() { // from class: HT3
                                                    @Override // android.view.View.OnClickListener
                                                    public final void onClick(View view2) {
                                                        ((Callback) PropertyModel.this.i(AbstractC9722sT3.c)).onResult(webAuthnCredential);
                                                    }
                                                });
                                                return;
                                            }
                                            ID2 id2 = AbstractC9722sT3.b;
                                            if (fd22 == id2) {
                                                ((ImageView) view.findViewById(R.id.webauthn_icon)).setImageDrawable(AbstractC2884Wf.a(view.getContext(), propertyModel3.h(id2)));
                                            } else if (fd22 == jd23) {
                                                ((TextView) view.findViewById(R.id.username)).setText(webAuthnCredential.getUsername());
                                                ((TextView) view.findViewById(R.id.display_name)).setText(webAuthnCredential.getDisplayName());
                                            }
                                        }
                                    });
                                }
                                if (i != 4) {
                                    return null;
                                }
                                return new JT3(recyclerView, AbstractC0193Bm2.l() ? R.layout.f61720_resource_name_obfuscated_res_0x7f0e02d0 : R.layout.f61710_resource_name_obfuscated_res_0x7f0e02cf, new TD2() { // from class: FT3
                                    @Override // defpackage.TD2
                                    public final void d(WD2 wd22, Object obj3, Object obj4) {
                                        final PropertyModel propertyModel3 = (PropertyModel) wd22;
                                        View view = (View) obj3;
                                        FD2 fd22 = (FD2) obj4;
                                        final Credential credential = (Credential) propertyModel3.i(AbstractC9037qT3.b);
                                        if (fd22 == AbstractC9037qT3.e) {
                                            view.setOnClickListener(new View.OnClickListener() { // from class: IT3
                                                @Override // android.view.View.OnClickListener
                                                public final void onClick(View view2) {
                                                    ((Callback) PropertyModel.this.i(AbstractC9037qT3.e)).onResult(credential);
                                                }
                                            });
                                            return;
                                        }
                                        JD2 jd23 = AbstractC9037qT3.d;
                                        if (fd22 == jd23) {
                                            TextView textView = (TextView) view.findViewById(R.id.touch_to_fill_button_title);
                                            C7928nE c7928nE = UN.a;
                                            boolean M09VlOh_ = N.M09VlOh_("TouchToFillPasswordSubmission");
                                            int i2 = R.string.f89260_resource_name_obfuscated_res_0x7f140b42;
                                            if (M09VlOh_) {
                                                Context context2 = view.getContext();
                                                if (((Boolean) propertyModel3.i(jd23)).booleanValue()) {
                                                    i2 = R.string.f89370_resource_name_obfuscated_res_0x7f140b4d;
                                                }
                                                textView.setText(context2.getString(i2));
                                                return;
                                            }
                                            textView.setText(R.string.f89260_resource_name_obfuscated_res_0x7f140b42);
                                        }
                                    }
                                });
                            }
                        }));
                        return;
                    }
                    return;
                }
                c11780yT3.i = (Callback) propertyModel2.i(jd2);
            }
        });
    }

    public static TouchToFillBridge create(long j, WindowAndroid windowAndroid) {
        QB a = UB.a(windowAndroid);
        if (a == null) {
            return null;
        }
        return new TouchToFillBridge(j, windowAndroid, a);
    }

    public final void destroy() {
        this.a = 0L;
    }

    public static Credential[] createCredentialArray(int i) {
        return new Credential[i];
    }

    public static void insertCredential(Credential[] credentialArr, int i, String str, String str2, String str3, String str4, boolean z, boolean z2, long j) {
        credentialArr[i] = new Credential(str, str2, str3, str4, z, z2, j);
    }

    public static WebAuthnCredential[] createWebAuthnCredentialArray(int i) {
        return new WebAuthnCredential[i];
    }

    public static void insertWebAuthnCredential(WebAuthnCredential[] webAuthnCredentialArr, int i, String str, String str2, String str3) {
        webAuthnCredentialArr[i] = new WebAuthnCredential(str, str2, str3);
    }

    /* JADX WARN: Type inference failed for: r6v9, types: [mT3] */
    public final void showCredentials(final GURL gurl, boolean z, Credential[] credentialArr, WebAuthnCredential[] webAuthnCredentialArr, boolean z2) {
        List<Credential> asList = Arrays.asList(credentialArr);
        List<WebAuthnCredential> asList2 = Arrays.asList(webAuthnCredentialArr);
        final C8351oT3 c8351oT3 = this.b.a;
        c8351oT3.b.o(AbstractC10065tT3.d, new Runnable() { // from class: jT3
            @Override // java.lang.Runnable
            public final void run() {
                C8351oT3 c8351oT32 = C8351oT3.this;
                c8351oT32.b.k(AbstractC10065tT3.a, false);
                EI2.h(2, 4, "PasswordManager.TouchToFill.UserAction");
                long j = c8351oT32.a.a;
                if (j != 0) {
                    N.MZxrSSig(j);
                }
            }
        });
        C5175fD1 c5175fD1 = (C5175fD1) c8351oT3.b.i(AbstractC10065tT3.b);
        c5175fD1.clear();
        HashMap e = PropertyModel.e(AbstractC9379rT3.f);
        HD2 hd2 = AbstractC9379rT3.b;
        int i = 1;
        boolean z3 = asList.size() == 1;
        AD2 ad2 = new AD2();
        ad2.a = z3;
        e.put(hd2, ad2);
        JD2 jd2 = AbstractC9379rT3.c;
        String b = AbstractC10615v34.b(1, gurl);
        GD2 gd2 = new GD2();
        gd2.a = b;
        e.put(jd2, gd2);
        HD2 hd22 = AbstractC9379rT3.d;
        AD2 ad22 = new AD2();
        ad22.a = z;
        e.put(hd22, ad22);
        HD2 hd23 = AbstractC9379rT3.a;
        AD2 ad23 = new AD2();
        ad23.a = z2;
        e.put(hd23, ad23);
        ID2 id2 = AbstractC9379rT3.e;
        int i2 = AbstractC0193Bm2.l() ? R.drawable.f53990_resource_name_obfuscated_res_0x7f0904d5 : R.drawable.f53980_resource_name_obfuscated_res_0x7f0904d4;
        DD2 dd2 = new DD2();
        dd2.a = i2;
        e.put(id2, dd2);
        c5175fD1.s(new C7272lK1(1, new PropertyModel(e)));
        c8351oT3.e = asList;
        for (Credential credential : asList) {
            HashMap e2 = PropertyModel.e(AbstractC9037qT3.f);
            JD2 jd22 = AbstractC9037qT3.b;
            GD2 gd22 = new GD2();
            gd22.a = credential;
            e2.put(jd22, gd22);
            JD2 jd23 = AbstractC9037qT3.e;
            Callback callback = new Callback() { // from class: lT3
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    Credential credential2 = (Credential) obj;
                    C8351oT3 c8351oT32 = C8351oT3.this;
                    c8351oT32.b.k(AbstractC10065tT3.a, false);
                    int indexOf = c8351oT32.e.indexOf(credential2);
                    if (c8351oT32.f.size() + c8351oT32.e.size() > 1) {
                        EI2.d(indexOf, "PasswordManager.TouchToFill.CredentialIndex");
                    }
                    EI2.h(0, 4, "PasswordManager.TouchToFill.UserAction");
                    long j = c8351oT32.a.a;
                    if (j != 0) {
                        N.MW5teN_W(j, credential2);
                    }
                }
            };
            GD2 gd23 = new GD2();
            gd23.a = callback;
            e2.put(jd23, gd23);
            JD2 jd24 = AbstractC9037qT3.c;
            String M25QTkfm = N.M25QTkfm(credential.getOriginUrl());
            GD2 gd24 = new GD2();
            gd24.a = M25QTkfm;
            e2.put(jd24, gd24);
            JD2 jd25 = AbstractC9037qT3.d;
            Boolean valueOf = Boolean.valueOf(z2);
            GD2 gd25 = new GD2();
            gd25.a = valueOf;
            final PropertyModel a = AbstractC1996Pj1.a(e2, jd25, gd25, e2);
            c5175fD1.s(new C7272lK1(2, a));
            if (asList2.size() + asList.size() != i) {
                i = 0;
            }
            if (i != 0) {
                c5175fD1.s(new C7272lK1(4, a));
            }
            final Credential credential2 = (Credential) a.i(jd22);
            String originUrl = credential2.getOriginUrl();
            C1193Je2 b2 = C1193Je2.b(originUrl);
            if (b2 == null || b2.a.isOpaque()) {
                originUrl = gurl.i();
            }
            final String str = originUrl;
            final ?? r6 = new LargeIconBridge.LargeIconCallback() { // from class: mT3
                @Override // org.chromium.components.favicon.LargeIconBridge.LargeIconCallback
                public final void onLargeIconAvailable(Bitmap bitmap, int i3, boolean z4, int i4) {
                    a.o(AbstractC9037qT3.a, new C8694pT3(str, bitmap, i3, C8351oT3.this.d));
                }
            };
            LargeIconBridge.LargeIconCallback largeIconCallback = new LargeIconBridge.LargeIconCallback() { // from class: nT3
                @Override // org.chromium.components.favicon.LargeIconBridge.LargeIconCallback
                public final void onLargeIconAvailable(Bitmap bitmap, int i3, boolean z4, int i4) {
                    C8351oT3 c8351oT32 = C8351oT3.this;
                    c8351oT32.getClass();
                    LargeIconBridge.LargeIconCallback largeIconCallback2 = r6;
                    if (bitmap == null) {
                        if (str.equals(credential2.getOriginUrl())) {
                            c8351oT32.c.b(gurl, c8351oT32.d, largeIconCallback2);
                            return;
                        }
                    }
                    largeIconCallback2.onLargeIconAvailable(bitmap, i3, z4, i4);
                }
            };
            LargeIconBridge largeIconBridge = c8351oT3.c;
            int i3 = c8351oT3.d;
            largeIconBridge.getClass();
            largeIconBridge.b(new GURL(str), i3, largeIconCallback);
            i = 1;
        }
        c8351oT3.f = asList2;
        for (WebAuthnCredential webAuthnCredential : asList2) {
            HashMap e3 = PropertyModel.e(AbstractC9722sT3.d);
            JD2 jd26 = AbstractC9722sT3.a;
            GD2 gd26 = new GD2();
            gd26.a = webAuthnCredential;
            e3.put(jd26, gd26);
            ID2 id22 = AbstractC9722sT3.b;
            DD2 dd22 = new DD2();
            dd22.a = R.drawable.f54000_resource_name_obfuscated_res_0x7f0904d6;
            e3.put(id22, dd22);
            JD2 jd27 = AbstractC9722sT3.c;
            Callback callback2 = new Callback() { // from class: kT3
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    WebAuthnCredential webAuthnCredential2 = (WebAuthnCredential) obj;
                    C8351oT3 c8351oT32 = C8351oT3.this;
                    c8351oT32.b.k(AbstractC10065tT3.a, false);
                    int indexOf = c8351oT32.f.indexOf(webAuthnCredential2) + c8351oT32.e.size();
                    if (c8351oT32.f.size() + c8351oT32.e.size() > 1) {
                        EI2.d(indexOf, "PasswordManager.TouchToFill.CredentialIndex");
                    }
                    EI2.h(3, 4, "PasswordManager.TouchToFill.UserAction");
                    long j = c8351oT32.a.a;
                    if (j != 0) {
                        N.M98beDi1(j, webAuthnCredential2);
                    }
                }
            };
            GD2 gd27 = new GD2();
            gd27.a = callback2;
            PropertyModel a2 = AbstractC1996Pj1.a(e3, jd27, gd27, e3);
            c5175fD1.s(new C7272lK1(3, a2));
            if (asList2.size() + asList.size() == 1) {
                c5175fD1.s(new C7272lK1(4, a2));
            }
        }
        c8351oT3.b.k(AbstractC10065tT3.a, true);
    }
}
