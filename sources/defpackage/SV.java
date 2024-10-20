package defpackage;

import com.google.android.libraries.elements.converters.b;
import java.util.BitSet;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class SV extends TZ {
    public b i;
    public final String[] j = {"children", "collectionDataSource", "collectionType", "commandResolver", "conversionContext", "logger", "onScrollBeganDraggingCommandFuture", "onScrollCommandFuture", "onScrollDidStopCommandFuture", "scrollToItemCommandHandler"};
    public final BitSet k = new BitSet(10);

    @Override // defpackage.TZ
    public final TZ k() {
        return this;
    }

    @Override // defpackage.TZ
    public final void r(WZ wz) {
        this.i = (b) wz;
    }

    @Override // defpackage.TZ
    public final WZ d() {
        TZ.e(10, this.k, this.j);
        return this.i;
    }
}
