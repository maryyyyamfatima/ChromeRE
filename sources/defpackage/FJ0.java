package defpackage;

import J.N;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.chrome.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.feed.sort_ui.FeedOptionsView;
import org.chromium.components.browser_ui.widget.chips.ChipView;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class FJ0 {
    public final FeedOptionsView a;
    public final Context b;
    public final ArrayList c;
    public final PropertyModel d;

    public FJ0(Context context) {
        FeedOptionsView feedOptionsView = (FeedOptionsView) LayoutInflater.from(context).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e010c, (ViewGroup) null, false);
        this.b = context;
        this.a = feedOptionsView;
        int M3tcgrxA = N.M3tcgrxA();
        ArrayList arrayList = new ArrayList();
        arrayList.add(a(1, R.string.0_resource_name_obfuscated_res_0x7f1404b1, R.string.0_resource_name_obfuscated_res_0x7f1404af, M3tcgrxA == 1));
        arrayList.add(a(2, R.string.0_resource_name_obfuscated_res_0x7f1405ab, R.string.0_resource_name_obfuscated_res_0x7f1404b0, M3tcgrxA == 2));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            PropertyModel propertyModel = (PropertyModel) it.next();
            FeedOptionsView feedOptionsView2 = this.a;
            ChipView chipView = new ChipView(feedOptionsView2.getContext(), null, 0, R.style.f98990_resource_name_obfuscated_res_0x7f1502d7);
            feedOptionsView2.a.addView(chipView);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) chipView.getLayoutParams();
            marginLayoutParams.setMarginEnd(feedOptionsView2.getContext().getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f08022f));
            chipView.setLayoutParams(marginLayoutParams);
            UD2.a(propertyModel, chipView, new DJ0());
        }
        this.c = arrayList;
        LD2 ld2 = GJ0.a;
        HashMap e = PropertyModel.e(new FD2[]{ld2});
        AD2 ad2 = new AD2();
        ad2.a = false;
        e.put(ld2, ad2);
        PropertyModel propertyModel2 = new PropertyModel(e);
        this.d = propertyModel2;
        UD2.a(propertyModel2, this.a, new TD2() { // from class: CJ0
            @Override // defpackage.TD2
            public final void d(WD2 wd2, Object obj, Object obj2) {
                PropertyModel propertyModel3 = (PropertyModel) wd2;
                FeedOptionsView feedOptionsView3 = (FeedOptionsView) obj;
                FD2 fd2 = (FD2) obj2;
                LD2 ld22 = GJ0.a;
                if (fd2 == ld22) {
                    boolean j = propertyModel3.j(ld22);
                    if ((feedOptionsView3.getVisibility() == 0) == j) {
                        return;
                    }
                    if (j) {
                        feedOptionsView3.measure(View.MeasureSpec.makeMeasureSpec(((ViewGroup) feedOptionsView3.getParent()).getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                        int measuredHeight = feedOptionsView3.getMeasuredHeight();
                        feedOptionsView3.getLayoutParams().height = 1;
                        feedOptionsView3.setVisibility(0);
                        HJ0 hj0 = new HJ0(feedOptionsView3, measuredHeight);
                        hj0.setDuration(200L);
                        feedOptionsView3.startAnimation(hj0);
                        return;
                    }
                    IJ0 ij0 = new IJ0(feedOptionsView3, feedOptionsView3.getMeasuredHeight());
                    ij0.setDuration(200L);
                    feedOptionsView3.startAnimation(ij0);
                }
            }
        });
    }

    public final PropertyModel a(int i, int i2, int i3, boolean z) {
        HashMap e = PropertyModel.e(OK.i);
        ID2 id2 = OK.e;
        DD2 dd2 = new DD2();
        dd2.a = i;
        e.put(id2, dd2);
        JD2 jd2 = OK.g;
        Context context = this.b;
        String string = context.getResources().getString(i2);
        GD2 gd2 = new GD2();
        gd2.a = string;
        e.put(jd2, gd2);
        LD2 ld2 = OK.f;
        AD2 ad2 = new AD2();
        ad2.a = z;
        e.put(ld2, ad2);
        PD2 pd2 = OK.a;
        Callback callback = new Callback() { // from class: EJ0
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                PropertyModel propertyModel = (PropertyModel) obj;
                Iterator it = FJ0.this.c.iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    LD2 ld22 = OK.f;
                    if (hasNext) {
                        PropertyModel propertyModel2 = (PropertyModel) it.next();
                        if (propertyModel2.j(ld22)) {
                            propertyModel2.k(ld22, false);
                        }
                    } else {
                        propertyModel.k(ld22, true);
                        N.Mn5$2mvw(propertyModel.h(OK.e));
                        return;
                    }
                }
            }
        };
        GD2 gd22 = new GD2();
        gd22.a = callback;
        e.put(pd2, gd22);
        PD2 pd22 = OK.b;
        String string2 = context.getResources().getString(i3);
        GD2 gd23 = new GD2();
        gd23.a = string2;
        return AbstractC5266fV2.a(e, pd22, gd23, e);
    }
}
