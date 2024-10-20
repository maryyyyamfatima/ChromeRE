package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.android.chrome.R;
import java.util.HashMap;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class WI1 implements PI1 {
    public final /* synthetic */ QI1 a;
    public final /* synthetic */ XI1 g;

    public WI1(XI1 xi1, QI1 qi1) {
        this.g = xi1;
        this.a = qi1;
    }

    @Override // defpackage.PI1
    public final void a(int i) {
        XI1 xi1 = this.g;
        if (i != 3) {
            if (i == 6) {
                return;
            }
            ZN3.b(R.string.0_resource_name_obfuscated_res_0x7f140a37, 1, xi1.a.p).d();
            return;
        }
        final YI1 yi1 = xi1.a;
        yi1.r = this.a.d;
        Activity activity = yi1.p;
        yi1.h = activity.getLayoutInflater().inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e0176, (ViewGroup) null);
        PD2 pd2 = GI1.a;
        PD2 pd22 = GI1.b;
        PD2 pd23 = GI1.c;
        PD2 pd24 = GI1.d;
        HashMap e = PropertyModel.e(new FD2[]{pd2, pd22, pd23, pd24});
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: RI1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                YI1 yi12 = YI1.this;
                yi12.getClass();
                ZI1.a(2);
                yi12.a.cancel();
                Runnable runnable = yi12.g;
                if (runnable != null) {
                    runnable.run();
                }
                yi12.g = null;
            }
        };
        GD2 gd2 = new GD2();
        gd2.a = onClickListener;
        e.put(pd2, gd2);
        View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: SI1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                YI1 yi12 = YI1.this;
                yi12.getClass();
                ZI1.a(1);
                yi12.a.cancel();
            }
        };
        GD2 gd22 = new GD2();
        gd22.a = onClickListener2;
        e.put(pd22, gd22);
        View.OnClickListener onClickListener3 = new View.OnClickListener() { // from class: TI1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                YI1.this.e(false);
            }
        };
        GD2 gd23 = new GD2();
        gd23.a = onClickListener3;
        e.put(pd23, gd23);
        View.OnClickListener onClickListener4 = new View.OnClickListener() { // from class: UI1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                YI1.this.e(true);
            }
        };
        GD2 gd24 = new GD2();
        gd24.a = onClickListener4;
        UD2.a(AbstractC5266fV2.a(e, pd24, gd24, e), yi1.h, new TD2() { // from class: VI1
            @Override // defpackage.TD2
            public final void d(WD2 wd2, Object obj, Object obj2) {
                PropertyModel propertyModel = (PropertyModel) wd2;
                View view = (View) obj;
                FD2 fd2 = (FD2) obj2;
                PD2 pd25 = GI1.b;
                if (pd25.equals(fd2)) {
                    ((ImageButton) view.findViewById(R.id.close_button)).setOnClickListener((View.OnClickListener) propertyModel.i(pd25));
                    return;
                }
                PD2 pd26 = GI1.a;
                if (pd26.equals(fd2)) {
                    ((ImageButton) view.findViewById(R.id.done_button)).setOnClickListener((View.OnClickListener) propertyModel.i(pd26));
                    return;
                }
                PD2 pd27 = GI1.c;
                if (pd27.equals(fd2)) {
                    ((ImageButton) view.findViewById(R.id.down_button)).setOnClickListener((View.OnClickListener) propertyModel.i(pd27));
                    return;
                }
                PD2 pd28 = GI1.d;
                if (pd28.equals(fd2)) {
                    ((ImageButton) view.findViewById(R.id.up_button)).setOnClickListener((View.OnClickListener) propertyModel.i(pd28));
                }
            }
        });
        Dialog dialog = new Dialog(activity, R.style.f105230_resource_name_obfuscated_res_0x7f150548);
        yi1.a = dialog;
        dialog.addContentView(yi1.h, new LinearLayout.LayoutParams(-1, -1));
        yi1.i = (ScrollView) yi1.h.findViewById(R.id.long_screenshot_scroll_view);
        yi1.j = yi1.h.findViewById(R.id.region_selection_top);
        yi1.k = yi1.h.findViewById(R.id.region_selection_bottom);
        yi1.l = yi1.h.findViewById(R.id.sharing_long_screenshot_dialog_instructions);
        View findViewById = yi1.h.findViewById(R.id.up_button);
        yi1.m = findViewById;
        findViewById.setOnTouchListener(yi1);
        View findViewById2 = yi1.h.findViewById(R.id.down_button);
        yi1.n = findViewById2;
        findViewById2.setOnTouchListener(yi1);
        ImageView imageView = (ImageView) yi1.h.findViewById(R.id.screenshot_image);
        yi1.o = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_START);
        yi1.o.setImageBitmap(yi1.r);
        ZI1.a(0);
        yi1.a.setOnShowListener(yi1);
        yi1.a.show();
    }
}
