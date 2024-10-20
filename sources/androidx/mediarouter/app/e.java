package androidx.mediarouter.app;

import android.view.View;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class e implements View.OnClickListener {
    public final /* synthetic */ MediaRouteExpandCollapseButton a;

    public e(MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton) {
        this.a = mediaRouteExpandCollapseButton;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton = this.a;
        boolean z = !mediaRouteExpandCollapseButton.m;
        mediaRouteExpandCollapseButton.m = z;
        if (z) {
            mediaRouteExpandCollapseButton.setImageDrawable(mediaRouteExpandCollapseButton.i);
            mediaRouteExpandCollapseButton.i.start();
            mediaRouteExpandCollapseButton.setContentDescription(mediaRouteExpandCollapseButton.l);
        } else {
            mediaRouteExpandCollapseButton.setImageDrawable(mediaRouteExpandCollapseButton.j);
            mediaRouteExpandCollapseButton.j.start();
            mediaRouteExpandCollapseButton.setContentDescription(mediaRouteExpandCollapseButton.k);
        }
        View.OnClickListener onClickListener = mediaRouteExpandCollapseButton.n;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }
}
