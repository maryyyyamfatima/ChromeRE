package defpackage;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.chromium.chrome.browser.compositor.CompositorViewHolder;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class D20 extends View {
    public boolean a;
    public final ArrayList g;
    public final /* synthetic */ CompositorViewHolder h;

    @Override // android.view.View
    public final boolean isImportantForAccessibility() {
        CompositorViewHolder compositorViewHolder = this.h;
        if (compositorViewHolder.i && !this.a) {
            this.a = true;
            ArrayList arrayList = this.g;
            arrayList.clear();
            compositorViewHolder.k.F(arrayList);
            int i = arrayList.size() == 0 ? 2 : 0;
            if (getImportantForAccessibility() != i) {
                setImportantForAccessibility(i);
                sendAccessibilityEvent(2048);
            }
            this.a = false;
        }
        return super.isImportantForAccessibility();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D20(CompositorViewHolder compositorViewHolder, Context context) {
        super(context);
        this.h = compositorViewHolder;
        this.g = new ArrayList();
    }
}
