package defpackage;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import org.chromium.chrome.browser.image_editor.bottom_bar.ShapeToolView;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: r63 */
/* loaded from: classes5.dex */
public final class C9260r63 {
    public final Context a;
    public final C2786Vl1 b;
    public final C9946t63 c;
    public final View d;
    public final PropertyModel e;
    public ShapeToolView f;

    public C9260r63(Context context, View view, C2786Vl1 c2786Vl1, Runnable runnable) {
        this.a = context;
        this.b = c2786Vl1;
        PropertyModel propertyModel = new PropertyModel(new ArrayList(Arrays.asList(AbstractC10289u63.d)));
        this.e = propertyModel;
        this.c = new C9946t63(propertyModel, c2786Vl1, runnable);
        this.d = view;
        propertyModel.m(AbstractC10289u63.b, 2);
    }
}
