package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import org.chromium.chrome.browser.image_editor.bottom_bar.CropToolView;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Qb0 */
/* loaded from: classes5.dex */
public final class C2085Qb0 {
    public final C2345Sb0 a;
    public CropToolView b;
    public final View c;
    public final PropertyModel d;

    public C2085Qb0(View view, C2786Vl1 c2786Vl1, Runnable runnable) {
        PropertyModel propertyModel = new PropertyModel(new ArrayList(Arrays.asList(AbstractC2475Tb0.c)));
        this.d = propertyModel;
        this.a = new C2345Sb0(propertyModel, c2786Vl1, runnable);
        this.c = view;
    }
}
