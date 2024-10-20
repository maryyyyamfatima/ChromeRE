package defpackage;

import android.view.View;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: fi2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5339fi2 extends RC1 {
    public C5339fi2(View view) {
        super(view);
    }

    @Override // defpackage.RC1
    public final void v(final PropertyModel propertyModel, OC1 oc1) {
        this.a.setOnClickListener(new View.OnClickListener() { // from class: ei2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ((Runnable) PropertyModel.this.i(GD1.x)).run();
            }
        });
    }
}
