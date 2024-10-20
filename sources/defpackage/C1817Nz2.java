package defpackage;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import com.android.chrome.R;
import java.util.HashMap;
import org.chromium.base.TraceEvent;
import org.chromium.chrome.browser.tasks.tab_management.PriceTrackingDialogView;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Nz2 */
/* loaded from: classes.dex */
public final class C1817Nz2 implements CompoundButton.OnCheckedChangeListener {
    public final PropertyModel a;
    public final ZX1 g;
    public final PriceTrackingDialogView h;

    public C1817Nz2(Activity activity, ZX1 zx1, YC3 yc3, InterfaceC10590uz3 interfaceC10590uz3, final C8875pz2 c8875pz2, int i) {
        TraceEvent i2 = TraceEvent.i("PriceTrackingDialogCoordinator.constructor", null);
        try {
            PriceTrackingDialogView priceTrackingDialogView = (PriceTrackingDialogView) LayoutInflater.from(activity).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e0219, (ViewGroup) null, false);
            this.h = priceTrackingDialogView;
            priceTrackingDialogView.a.setOnCheckedChangeListener(this);
            priceTrackingDialogView.g.setOnClickListener(new View.OnClickListener() { // from class: Lz2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ((C8875pz2) c8875pz2).d();
                }
            });
            this.g = zx1;
            C1687Mz2 c1687Mz2 = new C1687Mz2(i, yc3, interfaceC10590uz3);
            HashMap e = PropertyModel.e(AbstractC4249cY1.B);
            JD2 jd2 = AbstractC4249cY1.a;
            GD2 gd2 = new GD2();
            gd2.a = c1687Mz2;
            e.put(jd2, gd2);
            LD2 ld2 = AbstractC4249cY1.r;
            AD2 ad2 = new AD2();
            ad2.a = true;
            e.put(ld2, ad2);
            PD2 pd2 = AbstractC4249cY1.h;
            GD2 gd22 = new GD2();
            gd22.a = priceTrackingDialogView;
            e.put(pd2, gd22);
            this.a = new PropertyModel(e);
            if (i2 != null) {
                i2.close();
            }
        } catch (Throwable th) {
            if (i2 != null) {
                try {
                    i2.close();
                } catch (Throwable unused) {
                }
            }
            throw th;
        }
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (z != AbstractC2077Pz2.c()) {
            boolean e = AbstractC1947Oz2.e();
            AbstractC2077Pz2.a.p("Chrome.PriceTracking.TrackPricesOnTabs", !r3.e("Chrome.PriceTracking.TrackPricesOnTabs", e));
        }
    }
}
