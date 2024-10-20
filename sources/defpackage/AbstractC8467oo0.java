package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: oo0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC8467oo0 {
    public static Bundle a(Rect rect, MotionEvent motionEvent, View view) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("event", motionEvent);
        bundle.putParcelable("editRect", rect);
        bundle.putParcelable("rootViewRect", c(view));
        bundle.putString("hostSource", "webview");
        return bundle;
    }

    public static Rect c(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        return new Rect(i, i2, view.getWidth() + i, view.getHeight() + i2);
    }

    public static Bundle b(Rect rect, View view) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("editRect", rect);
        bundle.putParcelable("rootViewRect", c(view));
        bundle.putString("hostSource", "webview");
        return bundle;
    }
}
