package defpackage;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import org.chromium.chrome.browser.image_editor.bottom_bar.LineToolView;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes5.dex */
public final class DB1 {
    public final Context a;
    public final GB1 b;
    public final View c;
    public final PropertyModel d;
    public final C2786Vl1 e;
    public LineToolView f;

    public DB1(Context context, View view, C2786Vl1 c2786Vl1, Runnable runnable) {
        this.a = context;
        this.e = c2786Vl1;
        PropertyModel propertyModel = new PropertyModel(new ArrayList(Arrays.asList(HB1.g)));
        this.d = propertyModel;
        this.b = new GB1(propertyModel, c2786Vl1, runnable);
        this.c = view;
    }
}
