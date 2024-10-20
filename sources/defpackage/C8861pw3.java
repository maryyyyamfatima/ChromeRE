package defpackage;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import java.util.Objects;
import org.chromium.chrome.browser.tasks.tab_management.TabGridIphDialogView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: pw3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8861pw3 extends AbstractC4607db {
    public final /* synthetic */ TabGridIphDialogView b;

    public C8861pw3(TabGridIphDialogView tabGridIphDialogView) {
        this.b = tabGridIphDialogView;
    }

    @Override // defpackage.AbstractC4607db
    public final void b(Drawable drawable) {
        Handler handler = new Handler();
        Animatable animatable = this.b.n;
        Objects.requireNonNull(animatable);
        handler.postDelayed(new RunnableC8518ow3(animatable), 1500L);
    }
}
