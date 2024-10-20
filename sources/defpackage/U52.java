package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import org.chromium.chrome.browser.content_creation.notes.NoteCreationDialog;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class U52 extends View.AccessibilityDelegate {
    public final /* synthetic */ NoteCreationDialog a;

    public U52(NoteCreationDialog noteCreationDialog) {
        this.a = noteCreationDialog;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        int eventType = accessibilityEvent.getEventType();
        NoteCreationDialog noteCreationDialog = this.a;
        if (eventType == 1) {
            noteCreationDialog.A0.run();
        } else if (eventType == 32768) {
            view.setClickable(true);
            noteCreationDialog.v0 = ((Integer) view.getTag()).intValue();
            noteCreationDialog.S0();
        }
        super.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }
}
