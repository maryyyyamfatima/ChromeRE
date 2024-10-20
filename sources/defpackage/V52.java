package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.RelativeLayout;
import com.android.chrome.R;
import org.chromium.chrome.browser.content_creation.notes.NoteCreationDialog;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class V52 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ RelativeLayout a;
    public final /* synthetic */ int g;
    public final /* synthetic */ NoteCreationDialog h;

    public V52(NoteCreationDialog noteCreationDialog, RelativeLayout relativeLayout, int i) {
        this.h = noteCreationDialog;
        this.a = relativeLayout;
        this.g = i;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int measuredHeight = this.a.getMeasuredHeight();
        View findViewById = this.h.r0.findViewById(R.id.note_carousel);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) findViewById.getLayoutParams();
        marginLayoutParams.topMargin = (measuredHeight - this.g) / 2;
        findViewById.setLayoutParams(marginLayoutParams);
        findViewById.requestLayout();
    }
}
