package defpackage;

import android.view.View;
import androidx.recyclerview.widget.d;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: cc3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4273cc3 extends d {
    public final TD2 A;
    public PropertyModel B;
    public UD2 z;

    public C4273cc3(View view, TD2 td2) {
        super(view);
        this.A = td2;
    }

    public final void v(PropertyModel propertyModel) {
        UD2 ud2 = this.z;
        if (ud2 != null) {
            ud2.b();
        }
        this.B = propertyModel;
        if (propertyModel == null) {
            return;
        }
        this.z = UD2.a(propertyModel, this.a, this.A);
    }
}
