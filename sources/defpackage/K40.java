package defpackage;

import android.content.ContentResolver;
import androidx.recyclerview.widget.d;
import org.chromium.components.browser_ui.contacts_picker.ContactView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class K40 extends d implements EL0 {
    public final ContentResolver A;
    public final ContactView B;
    public A40 C;
    public FL0 D;
    public final int E;
    public final ViewOnClickListenerC10219tu2 z;

    public K40(ContactView contactView, ViewOnClickListenerC10219tu2 viewOnClickListenerC10219tu2, ContentResolver contentResolver, int i) {
        super(contactView);
        this.z = viewOnClickListenerC10219tu2;
        this.A = contentResolver;
        this.B = contactView;
        this.E = i;
    }
}
