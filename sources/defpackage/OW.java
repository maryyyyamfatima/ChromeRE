package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import com.android.chrome.R;
import org.chromium.chrome.browser.image_editor.bottom_bar.ColorSelectorView;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes5.dex */
public final class OW {
    public final RW a;

    public OW(Context context, FrameLayout frameLayout, C2786Vl1 c2786Vl1) {
        PropertyModel propertyModel = new PropertyModel(SW.e);
        propertyModel.m(SW.d, 2);
        this.a = new RW(context, propertyModel, c2786Vl1);
        UD2.a(propertyModel, (ColorSelectorView) frameLayout.findViewById(R.id.color_row), new NW());
    }
}
