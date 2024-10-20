package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: vB1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10659vB1 {
    public static final long a = TimeUnit.MINUTES.toMillis(10);
    public static final /* synthetic */ int b = 0;

    public static void a(boolean z, int i, int i2, int i3, int i4, int i5, int i6) {
        if (z) {
            EI2.d(i, "LightweightReactions.Editing.TappedDone.NumberOfReactionsAdded");
            EI2.d(i2, "LightweightReactions.Editing.TappedDone.NumberOfTypeChanges");
            EI2.d(i3, "LightweightReactions.Editing.TappedDone.NumberOfRotateScale");
            EI2.d(i4, "LightweightReactions.Editing.TappedDone.NumberOfDuplicate");
            EI2.d(i5, "LightweightReactions.Editing.TappedDone.NumberOfDelete");
            EI2.d(i6, "LightweightReactions.Editing.TappedDone.NumberOfMove");
            return;
        }
        EI2.d(i, "LightweightReactions.Editing.TappedCancel.NumberOfReactionsAdded");
        EI2.d(i2, "LightweightReactions.Editing.TappedCancel.NumberOfTypeChanges");
        EI2.d(i3, "LightweightReactions.Editing.TappedCancel.NumberOfRotateScale");
        EI2.d(i4, "LightweightReactions.Editing.TappedCancel.NumberOfDuplicate");
        EI2.d(i5, "LightweightReactions.Editing.TappedCancel.NumberOfDelete");
        EI2.d(i6, "LightweightReactions.Editing.TappedCancel.NumberOfMove");
    }
}
