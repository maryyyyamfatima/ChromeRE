package defpackage;

import org.chromium.components.browser_ui.contacts_picker.ContactView;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class J40 implements InterfaceC3906bY1 {
    public final /* synthetic */ ContactView a;

    @Override // defpackage.InterfaceC3906bY1
    public final void a(int i) {
    }

    @Override // defpackage.InterfaceC3906bY1
    public final void c(int i, PropertyModel propertyModel) {
        ContactView contactView = this.a;
        contactView.Q.c(i, propertyModel);
        contactView.R = null;
        contactView.Q = null;
    }

    public J40(ContactView contactView) {
        this.a = contactView;
    }
}
