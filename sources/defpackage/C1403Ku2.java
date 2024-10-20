package defpackage;

import android.app.ActivityOptions;
import android.app.PictureInPictureParams;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.Rational;
import java.lang.reflect.InvocationTargetException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ku2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1403Ku2 {
    public final Bundle a(Rect rect) {
        if (!AbstractC6205iD.a()) {
            return null;
        }
        try {
            ActivityOptions activityOptions = (ActivityOptions) ActivityOptions.class.getMethod("makeLaunchIntoPip", PictureInPictureParams.class).invoke(ActivityOptions.class, new PictureInPictureParams.Builder().setSourceRectHint(rect).setAspectRatio(new Rational(rect.width(), rect.height())).build());
            if (activityOptions != null) {
                return activityOptions.toBundle();
            }
            return null;
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            return null;
        } catch (NoSuchMethodException e2) {
            e2.printStackTrace();
            return null;
        } catch (InvocationTargetException e3) {
            e3.printStackTrace();
            return null;
        }
    }
}
