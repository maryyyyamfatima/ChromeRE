package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.widget.RelativeLayout;
import com.android.chrome.R;
import java.util.ArrayList;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.content_creation.reactions.scene.ReactionLayout;
import org.chromium.components.content_creation.reactions.ReactionMetadata;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final /* synthetic */ class UV2 implements Callback {
    public final /* synthetic */ ZV2 a;
    public final /* synthetic */ ReactionMetadata g;

    public /* synthetic */ UV2(ZV2 zv2, ReactionMetadata reactionMetadata) {
        this.a = zv2;
        this.g = reactionMetadata;
    }

    @Override // org.chromium.base.Callback
    public final ZE e0(Object obj) {
        return new ZE(this, obj);
    }

    @Override // org.chromium.base.Callback
    public final void onResult(Object obj) {
        ArrayList arrayList;
        C5070ev c5070ev = (C5070ev) obj;
        ZV2 zv2 = this.a;
        if (zv2.h == null) {
            return;
        }
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        ReactionMetadata reactionMetadata = this.g;
        C9661sH2 c9661sH2 = new C9661sH2(reactionMetadata, c5070ev, config);
        Activity activity = zv2.a;
        ReactionLayout reactionLayout = (ReactionLayout) AbstractC3236Yx1.a(R.layout.0_resource_name_obfuscated_res_0x7f0e0248, activity, null);
        reactionLayout.a(c9661sH2, zv2, reactionMetadata.b);
        int b = Ge4.b(activity, 192.0f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(b, b);
        Resources resources = activity.getResources();
        int i = resources.getDisplayMetrics().widthPixels;
        int i2 = resources.getDisplayMetrics().heightPixels;
        int b2 = Ge4.b(activity, 45.0f);
        int min = Math.min(((i - b) / 2) / b2, ((i2 - b) / 2) / b2);
        int i3 = 0;
        while (true) {
            arrayList = zv2.e;
            if (i3 < arrayList.size()) {
                if (((Integer) arrayList.get(i3)).intValue() == 0) {
                    break;
                } else {
                    i3++;
                }
            } else {
                i3 = arrayList.size();
                break;
            }
        }
        int min2 = Math.min(i3, min);
        int i4 = b / 2;
        int i5 = b2 * min2;
        int i6 = ((i / 2) - i4) + i5;
        int dimensionPixelSize = (((i2 / 2) - i4) - resources.getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f080812)) + i5;
        layoutParams.setMargins(i6, dimensionPixelSize, i - (i6 - b), i2 - (dimensionPixelSize - b));
        zv2.d.put(reactionLayout, Integer.valueOf(min2));
        if (min2 < arrayList.size()) {
            arrayList.set(min2, Integer.valueOf(((Integer) arrayList.get(min2)).intValue() + 1));
        } else {
            arrayList.add(1);
        }
        zv2.h.addView(reactionLayout, layoutParams);
        zv2.c.add(reactionLayout);
        zv2.c(reactionLayout, true);
        zv2.e(reactionLayout);
        reactionLayout.announceForAccessibility(activity.getString(R.string.0_resource_name_obfuscated_res_0x7f1405be));
    }
}
