package org.chromium.chrome.browser.image_editor;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.h;
import com.android.chrome.R;
import defpackage.AbstractC2373Sg3;
import defpackage.AbstractC4220cS2;
import defpackage.BK3;
import defpackage.C0143Bc2;
import defpackage.C0200Bo;
import defpackage.C0330Co;
import defpackage.C0935Hf;
import defpackage.C10402uS2;
import defpackage.C10547us;
import defpackage.C10745vS2;
import defpackage.C11512xh1;
import defpackage.C1805Nx0;
import defpackage.C1935Ox0;
import defpackage.C2786Vl1;
import defpackage.C2857Vz2;
import defpackage.C2987Wz2;
import defpackage.C3117Xz2;
import defpackage.C3247Yz2;
import defpackage.C3377Zz2;
import defpackage.C3443aA2;
import defpackage.C4301ch1;
import defpackage.C4907eS2;
import defpackage.C51;
import defpackage.C5251fS2;
import defpackage.C6969kS2;
import defpackage.C7313lS2;
import defpackage.C7394lh1;
import defpackage.C8426oh1;
import defpackage.C9112qh1;
import defpackage.C9861ss;
import defpackage.DialogC0805Gf;
import defpackage.DialogC5834h8;
import defpackage.DialogC8769ph1;
import defpackage.EI2;
import defpackage.LH3;
import defpackage.QO;
import defpackage.VS2;
import java.util.Objects;
import org.chromium.base.BundleUtils;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.image_editor.ImageEditorDialogFragment;
import org.chromium.chrome.browser.image_editor.OverlayFragment;
import org.chromium.components.browser_ui.widget.FadingShadowView;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes5.dex */
public class ImageEditorDialogFragment extends C0935Hf {
    public DialogC5834h8 A0;
    public final C7394lh1 B0 = new C7394lh1(this);
    public final C9112qh1 C0 = new C9112qh1(this);
    public Bitmap r0;
    public WindowAndroid s0;
    public String t0;
    public QO u0;
    public C4301ch1 v0;
    public SEngineXFragment w0;
    public OverlayFragment x0;
    public C2786Vl1 y0;
    public View z0;

    @Override // defpackage.DialogInterfaceOnCancelListenerC7423lm0, androidx.fragment.app.c
    public final void g0(Bundle bundle) {
        super.g0(bundle);
        N0(R.style.f105230_resource_name_obfuscated_res_0x7f150548);
    }

    @Override // defpackage.C0935Hf, defpackage.DialogInterfaceOnCancelListenerC7423lm0
    public final Dialog M0(Bundle bundle) {
        Runnable runnable = new Runnable() { // from class: kh1
            @Override // java.lang.Runnable
            public final void run() {
                boolean z;
                ImageEditorDialogFragment imageEditorDialogFragment = ImageEditorDialogFragment.this;
                C4301ch1 c4301ch1 = imageEditorDialogFragment.v0;
                C4645dh1 c4645dh1 = c4301ch1.a;
                boolean z2 = true;
                if (c4645dh1.a.d == VR3.l) {
                    z = false;
                } else {
                    c4645dh1.b.run();
                    z = true;
                }
                if (!z) {
                    if (c4301ch1.g) {
                        c4301ch1.a();
                    } else {
                        z2 = false;
                    }
                }
                if (z2) {
                    return;
                }
                C5490g8 c5490g8 = new C5490g8(imageEditorDialogFragment.K(), R.style.f105200_resource_name_obfuscated_res_0x7f150545);
                c5490g8.i(R.string.0_resource_name_obfuscated_res_0x7f1409a6);
                c5490g8.b(R.string.0_resource_name_obfuscated_res_0x7f1409a5);
                c5490g8.f(R.string.0_resource_name_obfuscated_res_0x7f1402f4, new DialogInterfaceOnClickListenerC8082nh1(imageEditorDialogFragment));
                c5490g8.e(R.string.0_resource_name_obfuscated_res_0x7f1409b1, new DialogInterfaceOnClickListenerC7738mh1(imageEditorDialogFragment));
                DialogC5834h8 a = c5490g8.a();
                imageEditorDialogFragment.A0 = a;
                a.setCanceledOnTouchOutside(false);
                imageEditorDialogFragment.A0.show();
            }
        };
        if (C9861ss.b()) {
            DialogC0805Gf dialogC0805Gf = new DialogC0805Gf(getActivity(), this.g0);
            dialogC0805Gf.g.b(new C8426oh1(runnable));
            return dialogC0805Gf;
        }
        return new DialogC8769ph1(getActivity(), this.g0, runnable);
    }

    @Override // androidx.fragment.app.c
    public final View i0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Activity activity = getActivity();
        if (BundleUtils.d(activity, "image_editor")) {
            layoutInflater = layoutInflater.cloneInContext(new C11512xh1(BundleUtils.a(activity, "image_editor").getClassLoader(), activity));
        }
        View inflate = layoutInflater.inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e012c, (ViewGroup) null);
        this.z0 = inflate;
        FadingShadowView fadingShadowView = (FadingShadowView) inflate.findViewById(R.id.top_drop_shadow);
        FadingShadowView fadingShadowView2 = (FadingShadowView) this.z0.findViewById(R.id.bottom_drop_shadow);
        fadingShadowView.a(K().getResources().getColor(R.color.0_resource_name_obfuscated_res_0x7f070865));
        fadingShadowView2.a(K().getResources().getColor(R.color.0_resource_name_obfuscated_res_0x7f070865));
        C0200Bo a = C0330Co.a();
        a.b(2);
        C0330Co a2 = a.a();
        SEngineXFragment sEngineXFragment = new SEngineXFragment();
        Bundle bundle2 = new Bundle();
        bundle2.putInt("taskRunnerImplementation", AbstractC2373Sg3.b(a2.a));
        bundle2.putInt("viewTransparency", AbstractC4220cS2.a(a2.c));
        bundle2.putInt("backgroundColor", a2.d);
        bundle2.putLong("randomSeed", a2.b);
        bundle2.putBoolean("enableInkDocument", a2.e);
        sEngineXFragment.E0(bundle2);
        this.w0 = sEngineXFragment;
        this.x0 = new OverlayFragment();
        h J2 = J();
        J2.getClass();
        C10547us c10547us = new C10547us(J2);
        c10547us.j(R.id.sengine_fragment, this.w0, null);
        c10547us.j(R.id.text_editor_fragment, this.x0, null);
        c10547us.e(false);
        return this.z0;
    }

    @Override // androidx.fragment.app.c
    public final void v0(View view, Bundle bundle) {
        this.y0 = new C2786Vl1(K(), this.x0);
        this.v0 = new C4301ch1(K(), view, this.y0, this, this.s0, this.t0, this.u0);
    }

    @Override // defpackage.DialogInterfaceOnCancelListenerC7423lm0, androidx.fragment.app.c
    public final void t0() {
        super.t0();
        boolean z = this.r0 == null || this.s0 == null || this.u0 == null;
        EI2.b("Sharing.ScreenshotsAndroid.IsEditorDismissedOnStart", z);
        if (z) {
            L0(false, false);
            return;
        }
        BK3 bk3 = this.w0.b0.a;
        if (this.r0.getHeight() > 4096 || this.r0.getWidth() > 4096) {
            this.w0.b0.j.d.set(this.C0);
            C3117Xz2 c3117Xz2 = (C3117Xz2) C3247Yz2.o.j();
            if (c3117Xz2.h) {
                c3117Xz2.l();
                c3117Xz2.h = false;
            }
            C3247Yz2 c3247Yz2 = (C3247Yz2) c3117Xz2.g;
            c3247Yz2.j |= 1;
            c3247Yz2.k = 0.0f;
            float width = this.r0.getWidth();
            if (c3117Xz2.h) {
                c3117Xz2.l();
                c3117Xz2.h = false;
            }
            C3247Yz2 c3247Yz22 = (C3247Yz2) c3117Xz2.g;
            c3247Yz22.j |= 2;
            c3247Yz22.l = width;
            if (c3117Xz2.h) {
                c3117Xz2.l();
                c3117Xz2.h = false;
            }
            C3247Yz2 c3247Yz23 = (C3247Yz2) c3117Xz2.g;
            c3247Yz23.j |= 4;
            c3247Yz23.m = 0.0f;
            float height = this.r0.getHeight();
            if (c3117Xz2.h) {
                c3117Xz2.l();
                c3117Xz2.h = false;
            }
            C3247Yz2 c3247Yz24 = (C3247Yz2) c3117Xz2.g;
            c3247Yz24.j |= 8;
            c3247Yz24.n = height;
            C3247Yz2 c3247Yz25 = (C3247Yz2) c3117Xz2.j();
            bk3.r(c3247Yz25);
            C4907eS2 c4907eS2 = (C4907eS2) C5251fS2.n.j();
            if (c4907eS2.h) {
                c4907eS2.l();
                c4907eS2.h = false;
            }
            C5251fS2 c5251fS2 = (C5251fS2) c4907eS2.g;
            c5251fS2.getClass();
            c5251fS2.j |= 2;
            c5251fS2.l = "host:PHOTO:screenshot_data";
            C3377Zz2 c3377Zz2 = (C3377Zz2) C3443aA2.o.j();
            C2857Vz2 c2857Vz2 = (C2857Vz2) C2987Wz2.m.j();
            float f = (c3247Yz25.k + c3247Yz25.l) / 2.0f;
            if (c2857Vz2.h) {
                c2857Vz2.l();
                c2857Vz2.h = false;
            }
            C2987Wz2 c2987Wz2 = (C2987Wz2) c2857Vz2.g;
            c2987Wz2.j |= 1;
            c2987Wz2.k = f;
            float f2 = (c3247Yz25.m + c3247Yz25.n) / 2.0f;
            if (c2857Vz2.h) {
                c2857Vz2.l();
                c2857Vz2.h = false;
            }
            C2987Wz2 c2987Wz22 = (C2987Wz2) c2857Vz2.g;
            c2987Wz22.j |= 2;
            c2987Wz22.l = f2;
            if (c3377Zz2.h) {
                c3377Zz2.l();
                c3377Zz2.h = false;
            }
            C3443aA2 c3443aA2 = (C3443aA2) c3377Zz2.g;
            C2987Wz2 c2987Wz23 = (C2987Wz2) c2857Vz2.j();
            c3443aA2.getClass();
            c2987Wz23.getClass();
            c3443aA2.k = c2987Wz23;
            c3443aA2.j |= 1;
            float f3 = c3247Yz25.l - c3247Yz25.k;
            if (c3377Zz2.h) {
                c3377Zz2.l();
                c3377Zz2.h = false;
            }
            C3443aA2 c3443aA22 = (C3443aA2) c3377Zz2.g;
            c3443aA22.j |= 2;
            c3443aA22.l = f3;
            float f4 = c3247Yz25.n - c3247Yz25.m;
            if (c3377Zz2.h) {
                c3377Zz2.l();
                c3377Zz2.h = false;
            }
            C3443aA2 c3443aA23 = (C3443aA2) c3377Zz2.g;
            c3443aA23.j |= 4;
            c3443aA23.m = f4;
            C3443aA2 c3443aA24 = (C3443aA2) c3377Zz2.j();
            if (c4907eS2.h) {
                c4907eS2.l();
                c4907eS2.h = false;
            }
            C5251fS2 c5251fS22 = (C5251fS2) c4907eS2.g;
            c5251fS22.getClass();
            c3443aA24.getClass();
            c5251fS22.k = c3443aA24;
            c5251fS22.j = 1 | c5251fS22.j;
            C5251fS2 c5251fS23 = (C5251fS2) c4907eS2.j();
            C6969kS2 c6969kS2 = (C6969kS2) C7313lS2.l.j();
            if (c6969kS2.h) {
                c6969kS2.l();
                c6969kS2.h = false;
            }
            C7313lS2 c7313lS2 = (C7313lS2) c6969kS2.g;
            c7313lS2.getClass();
            c5251fS23.getClass();
            c7313lS2.k = c5251fS23;
            c7313lS2.j = 56;
            bk3.o((C7313lS2) c6969kS2.j());
        } else {
            Bitmap bitmap = this.r0;
            int i = bk3.c;
            bk3.c = i + 1;
            String str = "sketchology://background_" + i;
            C10402uS2 c10402uS2 = (C10402uS2) C10745vS2.m.j();
            if (c10402uS2.h) {
                c10402uS2.l();
                c10402uS2.h = false;
            }
            C10745vS2 c10745vS2 = (C10745vS2) c10402uS2.g;
            c10745vS2.getClass();
            str.getClass();
            c10745vS2.j |= 1;
            c10745vS2.k = str;
            if (c10402uS2.h) {
                c10402uS2.l();
                c10402uS2.h = false;
            }
            C10745vS2 c10745vS22 = (C10745vS2) c10402uS2.g;
            c10745vS22.getClass();
            c10745vS22.l = 5;
            c10745vS22.j |= 2;
            bk3.i((C10745vS2) c10402uS2.j(), bitmap);
            C1805Nx0 c1805Nx0 = (C1805Nx0) C1935Ox0.m.j();
            float width2 = bitmap.getWidth();
            float height2 = bitmap.getHeight();
            C3117Xz2 c3117Xz22 = (C3117Xz2) C3247Yz2.o.j();
            if (c3117Xz22.h) {
                c3117Xz22.l();
                c3117Xz22.h = false;
            }
            C3247Yz2 c3247Yz26 = (C3247Yz2) c3117Xz22.g;
            c3247Yz26.j |= 1;
            c3247Yz26.k = 0.0f;
            if (c3117Xz22.h) {
                c3117Xz22.l();
                c3117Xz22.h = false;
            }
            C3247Yz2 c3247Yz27 = (C3247Yz2) c3117Xz22.g;
            c3247Yz27.j |= 4;
            c3247Yz27.m = 0.0f;
            if (c3117Xz22.h) {
                c3117Xz22.l();
                c3117Xz22.h = false;
            }
            C3247Yz2 c3247Yz28 = (C3247Yz2) c3117Xz22.g;
            c3247Yz28.j |= 2;
            c3247Yz28.l = width2;
            if (c3117Xz22.h) {
                c3117Xz22.l();
                c3117Xz22.h = false;
            }
            C3247Yz2 c3247Yz29 = (C3247Yz2) c3117Xz22.g;
            c3247Yz29.j |= 8;
            c3247Yz29.n = height2;
            C3247Yz2 c3247Yz210 = (C3247Yz2) c3117Xz22.j();
            if (c1805Nx0.h) {
                c1805Nx0.l();
                c1805Nx0.h = false;
            }
            C1935Ox0 c1935Ox0 = (C1935Ox0) c1805Nx0.g;
            c1935Ox0.getClass();
            c3247Yz210.getClass();
            c1935Ox0.l = c3247Yz210;
            c1935Ox0.j |= 2;
            bk3.r(c3247Yz210);
            if (c1805Nx0.h) {
                c1805Nx0.l();
                c1805Nx0.h = false;
            }
            C1935Ox0 c1935Ox02 = (C1935Ox0) c1805Nx0.g;
            c1935Ox02.getClass();
            c1935Ox02.j = 1 | c1935Ox02.j;
            c1935Ox02.k = str;
            C1935Ox0 c1935Ox03 = (C1935Ox0) c1805Nx0.j();
            if (c1935Ox03 == null) {
                throw new IllegalStateException("Attempting to set null background image info");
            }
            C6969kS2 c6969kS22 = (C6969kS2) C7313lS2.l.j();
            if (c6969kS22.h) {
                c6969kS22.l();
                c6969kS22.h = false;
            }
            C7313lS2 c7313lS22 = (C7313lS2) c6969kS22.g;
            c7313lS22.getClass();
            c7313lS22.k = c1935Ox03;
            c7313lS22.j = 10;
            bk3.o((C7313lS2) c6969kS22.j());
        }
        bk3.p(0);
        C2786Vl1 c2786Vl1 = this.y0;
        c2786Vl1.c = bk3;
        c2786Vl1.i(c2786Vl1.d);
        final OverlayFragment overlayFragment = this.x0;
        View view = this.z0;
        VS2 vs2 = this.w0.b0;
        C2786Vl1 c2786Vl12 = this.y0;
        C0143Bc2 c0143Bc2 = C9861ss.b() ? ((DialogC0805Gf) this.m0).g : null;
        final C4301ch1 c4301ch1 = this.v0;
        Objects.requireNonNull(c4301ch1);
        Callback callback = new Callback() { // from class: ih1
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                C4301ch1.this.b.a.a.k(DB.a, booleanValue);
            }
        };
        final C4301ch1 c4301ch12 = this.v0;
        Objects.requireNonNull(c4301ch12);
        Runnable runnable = new Runnable() { // from class: jh1
            @Override // java.lang.Runnable
            public final void run() {
                C10701vJ3 c10701vJ3 = C4301ch1.this.b.d;
                OW ow = c10701vJ3.g;
                int i2 = c10701vJ3.b.g;
                ow.a.b.m(SW.c, i2);
            }
        };
        overlayFragment.d0 = new LH3(overlayFragment.K(), view, c2786Vl12, c0143Bc2, new Callback() { // from class: hf2
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                int intValue = ((Integer) obj).intValue();
                OverlayFragment overlayFragment2 = OverlayFragment.this;
                TextView textView = overlayFragment2.d0.d;
                overlayFragment2.j0.onResult(Boolean.TRUE);
                overlayFragment2.k0.run();
                CharSequence text = textView.getText();
                Layout layout = textView.getLayout();
                boolean z2 = false;
                String str2 = "";
                int i2 = 0;
                while (i2 < layout.getLineCount()) {
                    str2 = str2 + text.subSequence(layout.getLineStart(i2), layout.getLineVisibleEnd(i2)).toString();
                    i2++;
                    if (i2 < layout.getLineCount()) {
                        str2 = str2 + "\n";
                    }
                }
                if (str2 != null && !str2.trim().isEmpty()) {
                    z2 = true;
                }
                if (!z2) {
                    str2 = "";
                }
                if (str2.isEmpty()) {
                    QH3 qh3 = overlayFragment2.d0.a;
                    qh3.j = "";
                    qh3.g.o(RH3.b, "");
                    qh3.i.setText("");
                }
                overlayFragment2.e0.a.i(textView.getCurrentTextColor(), (int) (overlayFragment2.l0 * intValue), str2);
            }
        });
        overlayFragment.b0 = vs2.a;
        overlayFragment.c0 = vs2;
        vs2.s.a.add(overlayFragment.m0);
        overlayFragment.c0.n.b.add(overlayFragment.n0);
        overlayFragment.f0 = new C51(overlayFragment.b0);
        overlayFragment.j0 = callback;
        overlayFragment.k0 = runnable;
        this.w0.b0.s.a.add(this.B0);
    }

    @Override // androidx.fragment.app.c
    public final void j0() {
        this.w0.b0.s.a.remove(this.B0);
        this.f11484J = true;
    }
}
