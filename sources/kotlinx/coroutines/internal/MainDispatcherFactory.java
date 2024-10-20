package kotlinx.coroutines.internal;

import defpackage.AbstractC10018tK1;
import java.util.List;
import kotlin.Metadata;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/internal/MainDispatcherFactory;", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public interface MainDispatcherFactory {
    AbstractC10018tK1 createDispatcher(List list);

    int getLoadPriority();

    String hintOnError();
}
