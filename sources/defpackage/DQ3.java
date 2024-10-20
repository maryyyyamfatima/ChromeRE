package defpackage;

import android.util.Property;
import org.chromium.chrome.browser.toolbar.top.ToolbarPhone;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class DQ3 extends Property {
    public final /* synthetic */ ToolbarPhone a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DQ3(ToolbarPhone toolbarPhone) {
        super(Float.class, "");
        this.a = toolbarPhone;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        return Float.valueOf(((ToolbarPhone) obj).P);
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        ((ToolbarPhone) obj).P = ((Float) obj2).floatValue();
        final ToolbarPhone toolbarPhone = this.a;
        toolbarPhone.a.onResult(new Runnable() { // from class: CQ3
            @Override // java.lang.Runnable
            public final void run() {
                ToolbarPhone.this.postInvalidateOnAnimation();
            }
        });
    }
}
