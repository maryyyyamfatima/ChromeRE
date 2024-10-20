package org.chromium.components.page_info;

import J.N;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.chrome.R;
import defpackage.AbstractC4851eH1;
import defpackage.AbstractC7403li4;
import defpackage.AbstractC9771sd;
import defpackage.C10475ug;
import defpackage.C11035wI;
import defpackage.C12193zg2;
import defpackage.InterfaceC11521xi4;
import defpackage.L30;
import defpackage.Y50;
import org.chromium.components.page_info.ConnectionInfoView;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.widget.ButtonCompat;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class ConnectionInfoView implements View.OnClickListener {
    public final Context a;
    public final L30 g;
    public final LinearLayout h;
    public final WebContents i;
    public final int j;
    public final int k;
    public final long l;
    public final C11035wI m;
    public C10475ug n;
    public C10475ug o;
    public ViewGroup p;
    public ViewGroup q;
    public ButtonCompat r;
    public String s;
    public final InterfaceC11521xi4 t;

    public ConnectionInfoView(Context context, WebContents webContents, L30 l30, InterfaceC11521xi4 interfaceC11521xi4) {
        this.a = context;
        this.g = l30;
        this.i = webContents;
        this.t = interfaceC11521xi4;
        this.m = new C11035wI(context);
        LinearLayout linearLayout = new LinearLayout(context);
        this.h = linearLayout;
        linearLayout.setOrientation(1);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f080647);
        this.j = dimensionPixelSize;
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f080648);
        this.k = dimensionPixelSize2;
        linearLayout.setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, 0);
        this.l = N.MJUBMbqq(this, webContents);
    }

    public final void addCertificateSection(int i, String str, String str2, String str3, int i2) {
        this.p = (ViewGroup) a(i, i2, str2).findViewById(R.id.connection_info_text_layout);
        if (str3 == null || str3.isEmpty()) {
            return;
        }
        C10475ug c10475ug = new C10475ug(this.a, null);
        this.n = c10475ug;
        c10475ug.setText(str3);
        AbstractC9771sd.i(R.style.f103000_resource_name_obfuscated_res_0x7f150469, this.n);
        this.n.setOnClickListener(this);
        this.n.setPadding(0, this.k, 0, 0);
        this.p.addView(this.n);
    }

    public final void addDescriptionSection(int i, String str, String str2, int i2) {
        this.q = (ViewGroup) a(i, i2, str2).findViewById(R.id.connection_info_text_layout);
    }

    public final View a(int i, int i2, String str) {
        Context context = this.a;
        View inflate = LayoutInflater.from(context).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e0096, (ViewGroup) null);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.connection_info_icon);
        imageView.setImageResource(i);
        imageView.setImageTintList(Y50.b(context, i2));
        TextView textView = (TextView) inflate.findViewById(R.id.connection_info_description);
        textView.setText(str);
        if (TextUtils.isEmpty(str)) {
            textView.setVisibility(8);
        }
        this.h.addView(inflate);
        return inflate;
    }

    public final void addResetCertDecisionsButton(String str) {
        Context context = this.a;
        ButtonCompat buttonCompat = new ButtonCompat(context, null, R.style.f96330_resource_name_obfuscated_res_0x7f1501c7);
        this.r = buttonCompat;
        buttonCompat.setText(str);
        this.r.setOnClickListener(this);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(this.r);
        linearLayout.setPadding(0, 0, 0, this.j);
        this.h.addView(linearLayout);
    }

    public final void addMoreInfoLink(String str) {
        C10475ug c10475ug = new C10475ug(this.a, null);
        this.o = c10475ug;
        this.s = "https://support.google.com/chrome?p=android_connection_info";
        c10475ug.setText(str);
        AbstractC9771sd.i(R.style.f103000_resource_name_obfuscated_res_0x7f150469, this.o);
        this.o.setPadding(0, this.k, 0, 0);
        this.o.setOnClickListener(this);
        this.q.addView(this.o);
    }

    public final void onReady() {
        FrameLayout frameLayout = ((C12193zg2) this.g).o;
        if (frameLayout != null) {
            frameLayout.addView(this.h);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ButtonCompat buttonCompat = this.r;
        WebContents webContents = this.i;
        if (buttonCompat != view) {
            C10475ug c10475ug = this.n;
            InterfaceC11521xi4 interfaceC11521xi4 = this.t;
            if (c10475ug != view) {
                if (this.o == view) {
                    if (interfaceC11521xi4 != null && interfaceC11521xi4.a()) {
                        ((AbstractC7403li4) interfaceC11521xi4).O(10, new Runnable() { // from class: K30
                            @Override // java.lang.Runnable
                            public final void run() {
                                ConnectionInfoView.this.b();
                            }
                        });
                        return;
                    } else {
                        b();
                        return;
                    }
                }
                return;
            }
            final byte[][] MW74qHgy = N.MW74qHgy(webContents);
            if (MW74qHgy == null) {
                return;
            }
            if (interfaceC11521xi4 != null && interfaceC11521xi4.a()) {
                ((AbstractC7403li4) interfaceC11521xi4).O(9, new Runnable() { // from class: J30
                    @Override // java.lang.Runnable
                    public final void run() {
                        ConnectionInfoView.this.m.f(MW74qHgy);
                    }
                });
                return;
            } else {
                this.m.f(MW74qHgy);
                return;
            }
        }
        N.MYkS$dAY(this.l, this, webContents);
        ((PageInfoController) ((C12193zg2) this.g).a).d();
    }

    public final void b() {
        Context context = this.a;
        ((PageInfoController) ((C12193zg2) this.g).a).d();
        try {
            Intent parseUri = Intent.parseUri(this.s, 1);
            parseUri.putExtra("create_new_tab", true);
            parseUri.putExtra("com.android.browser.application_id", context.getPackageName());
            context.startActivity(parseUri);
        } catch (Exception e) {
            AbstractC4851eH1.f("ConnectionInfoView", "Bad URI %s", this.s, e);
        }
    }
}
