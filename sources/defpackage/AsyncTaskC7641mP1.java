package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.util.SparseArray;
import androidx.mediarouter.app.MediaRouteButton;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: mP1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class AsyncTaskC7641mP1 extends AsyncTask {
    public final int a;
    public final Context b;
    public final /* synthetic */ MediaRouteButton c;

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        SparseArray sparseArray = MediaRouteButton.v;
        int i = this.a;
        if (((Drawable.ConstantState) sparseArray.get(i)) == null) {
            return AbstractC2884Wf.a(this.b, i);
        }
        return null;
    }

    @Override // android.os.AsyncTask
    public final void onCancelled(Object obj) {
        Drawable drawable = (Drawable) obj;
        if (drawable != null) {
            MediaRouteButton.v.put(this.a, drawable.getConstantState());
        }
        this.c.m = null;
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        Drawable drawable = (Drawable) obj;
        int i = this.a;
        MediaRouteButton mediaRouteButton = this.c;
        if (drawable == null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) MediaRouteButton.v.get(i);
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            mediaRouteButton.m = null;
        } else {
            MediaRouteButton.v.put(i, drawable.getConstantState());
            mediaRouteButton.m = null;
        }
        mediaRouteButton.d(drawable);
    }

    public AsyncTaskC7641mP1(MediaRouteButton mediaRouteButton, int i, Context context) {
        this.c = mediaRouteButton;
        this.a = i;
        this.b = context;
    }
}
