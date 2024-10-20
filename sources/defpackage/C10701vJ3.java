package defpackage;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import org.chromium.chrome.browser.image_editor.bottom_bar.TextToolView;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: vJ3 */
/* loaded from: classes5.dex */
public final class C10701vJ3 {
    public final Context a;
    public final C2786Vl1 b;
    public final C11387xJ3 c;
    public final View d;
    public final PropertyModel e;
    public TextToolView f;
    public OW g;

    public C10701vJ3(Context context, View view, C2786Vl1 c2786Vl1, Runnable runnable) {
        this.a = context;
        this.b = c2786Vl1;
        PropertyModel propertyModel = new PropertyModel(new ArrayList(Arrays.asList(AbstractC11730yJ3.c)));
        this.e = propertyModel;
        this.c = new C11387xJ3(propertyModel, c2786Vl1, runnable);
        this.d = view;
    }
}
