package defpackage;

import android.os.Parcel;
import com.google.android.gms.feedback.FeedbackOptions;
import java.security.SecureRandom;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class BL0 {
    public static String b() {
        return System.currentTimeMillis() + "-" + Math.abs(new SecureRandom().nextLong());
    }

    public static void a(FeedbackOptions feedbackOptions) {
        if (!((Boolean) AbstractC6301iW0.c.a()).booleanValue() || feedbackOptions == null) {
            return;
        }
        Parcel obtain = Parcel.obtain();
        feedbackOptions.writeToParcel(obtain, 0);
        int dataSize = obtain.dataSize();
        obtain.recycle();
        C8910q51 c8910q51 = AbstractC6301iW0.b;
        if (dataSize <= ((Integer) c8910q51.a()).intValue()) {
            return;
        }
        throw new IllegalStateException("Max allowed feedback options size of " + String.valueOf(c8910q51.a()) + " exceeded, you are passing in feedback options of " + dataSize + " size.");
    }
}
