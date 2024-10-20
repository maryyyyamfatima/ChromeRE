package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import com.android.chrome.R;
import java.util.ArrayList;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.image_editor.OverlayFragment;
import org.chromium.chrome.browser.image_editor.text.TextEditorHandleView;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes5.dex */
public final class RW {
    public final C2786Vl1 a;
    public final PropertyModel b;

    public RW(Context context, PropertyModel propertyModel, C2786Vl1 c2786Vl1) {
        this.a = c2786Vl1;
        this.b = propertyModel;
        propertyModel.o(SW.b, new Callback() { // from class: QW
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                RW rw = RW.this;
                rw.getClass();
                final int intValue = ((Integer) obj).intValue();
                ND2 nd2 = SW.d;
                PropertyModel propertyModel2 = rw.b;
                int h = propertyModel2.h(nd2);
                C2786Vl1 c2786Vl12 = rw.a;
                if (h == 1) {
                    AbstractC9454rh1.a(14);
                    if (c2786Vl12.d == VR3.h) {
                        c2786Vl12.f = intValue;
                        ((BK3) c2786Vl12.c).s(C2786Vl1.c(intValue, c2786Vl12.e));
                    }
                } else if (propertyModel2.h(nd2) == 2) {
                    AbstractC9454rh1.a(12);
                    if (c2786Vl12.d == VR3.s) {
                        c2786Vl12.g = intValue;
                        ((BK3) c2786Vl12.c).s(C2786Vl1.e(intValue));
                        OverlayFragment overlayFragment = c2786Vl12.a;
                        final C11653y51 c11653y51 = overlayFragment.e0;
                        TextEditorHandleView textEditorHandleView = c11653y51.b;
                        if (textEditorHandleView.m) {
                            textEditorHandleView.post(new Runnable() { // from class: x51
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C11996z51 c11996z51 = C11653y51.this.a;
                                    c11996z51.a.m(B51.h, intValue);
                                }
                            });
                        }
                        LH3 lh3 = overlayFragment.d0;
                        lh3.a.g.m(RH3.c, intValue);
                    }
                } else if (propertyModel2.h(nd2) == 3) {
                    AbstractC9454rh1.a(16);
                    if (c2786Vl12.d == VR3.y) {
                        c2786Vl12.h = intValue;
                        ((BK3) c2786Vl12.c).s(C2786Vl1.d(intValue, c2786Vl12.i));
                    }
                }
                propertyModel2.m(SW.c, intValue);
            }
        });
        TypedArray obtainTypedArray = context.getResources().obtainTypedArray(R.array.0_resource_name_obfuscated_res_0x7f040070);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < obtainTypedArray.length(); i++) {
            arrayList.add(Integer.valueOf(obtainTypedArray.getColor(i, 0)));
        }
        obtainTypedArray.recycle();
        this.b.o(SW.a, arrayList);
        this.b.m(SW.c, context.getResources().getColor(R.color.0_resource_name_obfuscated_res_0x7f070105));
    }
}
