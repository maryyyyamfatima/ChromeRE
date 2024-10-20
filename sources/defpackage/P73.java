package defpackage;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import org.chromium.chrome.browser.image_editor.share_sheet.ShareSheetView;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes5.dex */
public final class P73 {
    public final PropertyModel a;
    public final View b;
    public ShareSheetView c;

    public P73(Context context, View view, Runnable runnable, C2786Vl1 c2786Vl1, WindowAndroid windowAndroid, String str, QO qo, Runnable runnable2) {
        this.b = view;
        PropertyModel propertyModel = new PropertyModel(new ArrayList(Arrays.asList(Z73.c)));
        this.a = propertyModel;
        propertyModel.o(Z73.b, runnable2);
        new Y73(context, propertyModel, runnable, c2786Vl1, windowAndroid, str, qo);
    }
}
