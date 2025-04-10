package toni.sodiumleafculling;


#if FABRIC
import java.util.List;
import com.bawnorton.mixinsquared.api.MixinCanceller;

public class LeafCullingMixinCanceller implements MixinCanceller {
    @Override
    public boolean shouldCancel(List<String> targetClassNames, String mixinClassName) {
        if (mixinClassName.equals("LeavesBlock_typesMixin"))
            return true;

        return false;
    }
}
#endif