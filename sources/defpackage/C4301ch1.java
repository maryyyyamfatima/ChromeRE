package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.android.chrome.R;
import java.util.Objects;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.image_editor.share_sheet.ShareSheetView;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ch1 */
/* loaded from: classes5.dex */
public final class C4301ch1 {
    public final C4645dh1 a;
    public final AB b;
    public final C6970kS3 c;
    public final P73 d;
    public final C2786Vl1 e;
    public final View f;
    public boolean g;

    public C4301ch1(Context context, View view, C2786Vl1 c2786Vl1, final DialogInterfaceOnCancelListenerC7423lm0 dialogInterfaceOnCancelListenerC7423lm0, WindowAndroid windowAndroid, String str, QO qo) {
        this.e = c2786Vl1;
        this.a = new C4645dh1(c2786Vl1, new Runnable() { // from class: Xg1
            @Override // java.lang.Runnable
            public final void run() {
                C4301ch1 c4301ch1 = C4301ch1.this;
                c4301ch1.e.a();
                c4301ch1.b.a();
            }
        });
        Objects.requireNonNull(dialogInterfaceOnCancelListenerC7423lm0);
        this.d = new P73(context, view, new Runnable() { // from class: Yg1
            @Override // java.lang.Runnable
            public final void run() {
                DialogInterfaceOnCancelListenerC7423lm0.this.L0(false, false);
            }
        }, c2786Vl1, windowAndroid, str, qo, new Runnable() { // from class: Zg1
            @Override // java.lang.Runnable
            public final void run() {
                C4301ch1.this.a();
            }
        });
        this.b = new AB(context, view, c2786Vl1, new Callback() { // from class: ah1
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                C4301ch1 c4301ch1 = C4301ch1.this;
                c4301ch1.getClass();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                c4301ch1.c.a.a.k(AbstractC8346oS3.a, booleanValue);
            }
        });
        this.c = new C6970kS3(view, c2786Vl1, new Runnable() { // from class: Yg1
            @Override // java.lang.Runnable
            public final void run() {
                DialogInterfaceOnCancelListenerC7423lm0.this.L0(false, false);
            }
        }, new Runnable() { // from class: bh1
            @Override // java.lang.Runnable
            public final void run() {
                VR3 vr3 = VR3.l;
                C4301ch1 c4301ch1 = C4301ch1.this;
                C2786Vl1 c2786Vl12 = c4301ch1.e;
                c2786Vl12.i(vr3);
                LD2 ld2 = DB.b;
                AB ab = c4301ch1.b;
                ab.a.a.k(ld2, false);
                DB1 db1 = ab.b;
                if (db1.f != null) {
                    db1.b.a.k(HB1.c, false);
                }
                C2085Qb0 c2085Qb0 = ab.c;
                if (c2085Qb0.b != null) {
                    c2085Qb0.a.a.k(AbstractC2475Tb0.a, false);
                }
                C10701vJ3 c10701vJ3 = ab.d;
                if (c10701vJ3.f != null) {
                    c10701vJ3.c.a.k(AbstractC11730yJ3.a, false);
                }
                C9260r63 c9260r63 = ab.e;
                if (c9260r63.f != null) {
                    c9260r63.c.a.k(AbstractC10289u63.a, false);
                }
                c4301ch1.c.a.a.k(AbstractC8346oS3.b, false);
                AbstractC11855yh1.a((ViewGroup) c4301ch1.f, false);
                ((BK3) c2786Vl12.c).l(false);
                P73 p73 = c4301ch1.d;
                ShareSheetView shareSheetView = p73.c;
                if (shareSheetView != null) {
                    shareSheetView.setVisibility(0);
                } else {
                    ShareSheetView shareSheetView2 = (ShareSheetView) ((ViewStub) p73.b.findViewById(R.id.bottombar_stub)).inflate();
                    p73.c = shareSheetView2;
                    UD2.a(p73.a, shareSheetView2, new TD2() { // from class: K73
                        @Override // defpackage.TD2
                        public final void d(WD2 wd2, Object obj, Object obj2) {
                            PropertyModel propertyModel = (PropertyModel) wd2;
                            ShareSheetView shareSheetView3 = (ShareSheetView) obj;
                            FD2 fd2 = (FD2) obj2;
                            PD2 pd2 = Z73.a;
                            if (pd2 == fd2) {
                                final Callback callback = (Callback) propertyModel.i(pd2);
                                final Integer i = 1;
                                shareSheetView3.findViewById(R.id.share).setOnClickListener(new View.OnClickListener() { // from class: h83
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        int i22 = ShareSheetView.g;
                                        Callback.this.onResult(i);
                                    }
                                });
                                final Integer i2 = 2;
                                shareSheetView3.findViewById(R.id.save).setOnClickListener(new View.OnClickListener() { // from class: h83
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        int i22 = ShareSheetView.g;
                                        Callback.this.onResult(i2);
                                    }
                                });
                                final Integer i3 = 3;
                                shareSheetView3.findViewById(R.id.delete).setOnClickListener(new View.OnClickListener() { // from class: h83
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        int i22 = ShareSheetView.g;
                                        Callback.this.onResult(i3);
                                    }
                                });
                                return;
                            }
                            PD2 pd22 = Z73.b;
                            if (pd22 == fd2) {
                                shareSheetView3.a = (Runnable) propertyModel.i(pd22);
                            }
                        }
                    });
                }
                c4301ch1.g = true;
            }
        });
        this.f = view.findViewById(R.id.sengine_fragment);
    }

    public final void a() {
        VR3 vr3 = VR3.l;
        C2786Vl1 c2786Vl1 = this.e;
        c2786Vl1.i(vr3);
        this.b.a();
        this.c.a.a.k(AbstractC8346oS3.b, true);
        AbstractC11855yh1.a((ViewGroup) this.f, true);
        ((BK3) c2786Vl1.c).l(true);
        this.d.c.setVisibility(8);
        this.g = false;
    }
}
