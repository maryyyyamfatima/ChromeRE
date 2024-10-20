package defpackage;

import org.chromium.components.browser_ui.contacts_picker.ContactsPickerToolbar;
import org.chromium.components.browser_ui.contacts_picker.TopView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: nu2 */
/* loaded from: classes2.dex */
public final class C8161nu2 extends AbstractC8991qK2 {
    public final /* synthetic */ ViewOnClickListenerC10219tu2 a;

    public C8161nu2(ViewOnClickListenerC10219tu2 viewOnClickListenerC10219tu2) {
        this.a = viewOnClickListenerC10219tu2;
    }

    @Override // defpackage.AbstractC8991qK2
    public final void a() {
        ViewOnClickListenerC10219tu2 viewOnClickListenerC10219tu2 = this.a;
        TopView topView = viewOnClickListenerC10219tu2.k;
        boolean z = true;
        if (topView != null) {
            int i = (topView.k.getVisibility() == 0 && topView.k.isSelected()) ? 1 : 0;
            if (topView.l.getVisibility() == 0 && topView.l.isSelected()) {
                i++;
            }
            if (topView.m.getVisibility() == 0 && topView.m.isSelected()) {
                i++;
            }
            if (topView.n.getVisibility() == 0 && topView.n.isSelected()) {
                i++;
            }
            if (topView.o.getVisibility() == 0 && topView.o.isSelected()) {
                i++;
            }
            if (i <= 0) {
                z = false;
            }
        }
        ContactsPickerToolbar contactsPickerToolbar = viewOnClickListenerC10219tu2.j;
        contactsPickerToolbar.C0 = z;
        contactsPickerToolbar.V();
    }
}
