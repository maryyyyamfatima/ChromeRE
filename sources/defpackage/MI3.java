package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.EditText;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class MI3 extends EditText {
    @Override // android.view.View
    public final void invalidate() {
    }

    public MI3(Context context) {
        super(context);
    }

    @Override // android.view.View
    public final void setBackground(Drawable drawable) {
        if (drawable != null) {
            drawable.mutate();
        }
        super.setBackground(drawable);
    }
}
