package com.cyrillrx.adventofcode

import kotlin.math.abs

class Day01(input: String) {
    val lines = input.split("\n")
    val list1: List<Int>
    val list2: List<Int>

    init {
        val list1 = mutableListOf<Int>()
        val list2 = mutableListOf<Int>()
        lines.forEach {
            val split = it.split("   ")
            list1.add(split[0].toInt())
            list2.add(split[1].toInt())
        }
        this.list1 = list1
        this.list2 = list2
    }

    fun part1(): String {
        val list1 = list1.toMutableList()
        val list2 = list2.toMutableList()

        // Match smallest entries
        val pairs = mutableListOf<Pair<Int, Int>>()
        while (list1.isNotEmpty() && list2.isNotEmpty()) {
            val smallest1 = list1.getSmallest()
            list1.remove(smallest1)

            val smallest2 = list2.getSmallest()
            list2.remove(smallest2)

            pairs.add(Pair(smallest1, smallest2))
        }

        // Calculate distances
        val distances = mutableListOf<Int>()
        pairs.forEach { pair ->
            val distance = abs(pair.first - pair.second)
            distances.add(distance)
        }

        val sum = distances.sum()
        return sum.toString()
    }

    fun part2(): String {
        val similarities = mutableListOf<Int>()
        list1.forEach { value ->
            val valueCountInList2 = list2.count { it == value }
            similarities.add(value * valueCountInList2)
        }

        return similarities.sum().toString()
    }

    companion object {
        fun List<Int>.getSmallest(): Int {
            var min: Int = Int.MAX_VALUE
            forEach { value ->
                if (value < min) {
                    min = value
                }
            }
            return min
        }

        const val INPUT = "98415   86712\n" +
                "21839   96206\n" +
                "14958   40971\n" +
                "91380   63825\n" +
                "48482   40971\n" +
                "47618   98239\n" +
                "69295   72055\n" +
                "73790   20692\n" +
                "95008   91254\n" +
                "30041   73739\n" +
                "46680   55405\n" +
                "12873   14682\n" +
                "47722   74915\n" +
                "81092   16759\n" +
                "64463   31849\n" +
                "82981   43091\n" +
                "52948   63825\n" +
                "86073   90988\n" +
                "37341   87339\n" +
                "76759   85103\n" +
                "92565   20139\n" +
                "70507   99102\n" +
                "10215   32134\n" +
                "80264   72821\n" +
                "45235   31963\n" +
                "41003   84233\n" +
                "88490   76750\n" +
                "87607   20692\n" +
                "59690   33244\n" +
                "76224   26934\n" +
                "70928   58112\n" +
                "12896   13883\n" +
                "45046   97624\n" +
                "14802   36874\n" +
                "26477   90988\n" +
                "99942   42762\n" +
                "97700   68810\n" +
                "31112   62593\n" +
                "63110   73448\n" +
                "15702   58189\n" +
                "44444   28782\n" +
                "56091   79236\n" +
                "88976   38094\n" +
                "33509   84823\n" +
                "55932   52315\n" +
                "37002   55140\n" +
                "49031   69737\n" +
                "62442   84713\n" +
                "91598   28894\n" +
                "96109   43306\n" +
                "10029   65760\n" +
                "81145   78422\n" +
                "57749   88707\n" +
                "30352   38306\n" +
                "58767   84823\n" +
                "65644   83417\n" +
                "14392   60859\n" +
                "38548   23806\n" +
                "45420   84823\n" +
                "86410   24207\n" +
                "86074   38732\n" +
                "34418   40971\n" +
                "69259   84823\n" +
                "76444   61427\n" +
                "52200   60859\n" +
                "80383   46070\n" +
                "24950   29096\n" +
                "92504   56091\n" +
                "63952   37106\n" +
                "21571   67919\n" +
                "30674   98750\n" +
                "73909   62113\n" +
                "51915   81880\n" +
                "58884   64362\n" +
                "35784   90988\n" +
                "77693   46396\n" +
                "43415   40971\n" +
                "17619   43889\n" +
                "61513   58139\n" +
                "86035   43930\n" +
                "79559   90195\n" +
                "74180   41607\n" +
                "62739   98079\n" +
                "53632   57293\n" +
                "21594   96012\n" +
                "56752   20348\n" +
                "49825   90988\n" +
                "27016   54248\n" +
                "79239   60318\n" +
                "79102   46726\n" +
                "15178   47103\n" +
                "69131   73658\n" +
                "77863   72055\n" +
                "57745   74229\n" +
                "75083   30406\n" +
                "30789   88659\n" +
                "59510   68773\n" +
                "37256   87339\n" +
                "89551   24882\n" +
                "24912   11151\n" +
                "65718   87339\n" +
                "18607   72055\n" +
                "89744   34103\n" +
                "13502   63777\n" +
                "74252   93822\n" +
                "26823   88948\n" +
                "12926   20361\n" +
                "57362   37728\n" +
                "42529   72897\n" +
                "55701   90106\n" +
                "80515   90673\n" +
                "53130   98750\n" +
                "11755   39123\n" +
                "15567   16982\n" +
                "45347   73739\n" +
                "56219   84823\n" +
                "80487   63515\n" +
                "57918   85690\n" +
                "24138   78136\n" +
                "89383   68948\n" +
                "33043   72055\n" +
                "74588   28108\n" +
                "83590   64739\n" +
                "71034   65419\n" +
                "75815   23490\n" +
                "20112   76750\n" +
                "14438   82344\n" +
                "10441   40971\n" +
                "73704   18644\n" +
                "73739   51191\n" +
                "17858   91254\n" +
                "45052   90988\n" +
                "71745   63825\n" +
                "61105   71049\n" +
                "69625   64414\n" +
                "72147   79179\n" +
                "39613   42434\n" +
                "49486   16939\n" +
                "37159   88707\n" +
                "81789   21633\n" +
                "43834   31963\n" +
                "96281   51697\n" +
                "67908   31849\n" +
                "25034   44271\n" +
                "65569   75978\n" +
                "58832   33079\n" +
                "73347   31849\n" +
                "77421   84823\n" +
                "11586   91254\n" +
                "67679   36415\n" +
                "39964   22528\n" +
                "37638   61931\n" +
                "26753   90315\n" +
                "90409   39489\n" +
                "55746   76750\n" +
                "44727   95445\n" +
                "90778   60859\n" +
                "32071   78505\n" +
                "60089   50682\n" +
                "32309   11406\n" +
                "19358   80132\n" +
                "48376   87339\n" +
                "45291   47907\n" +
                "56391   84233\n" +
                "76798   48120\n" +
                "78422   60859\n" +
                "58146   21303\n" +
                "53529   63825\n" +
                "98604   91254\n" +
                "34637   49452\n" +
                "94181   39489\n" +
                "27144   99118\n" +
                "49195   80934\n" +
                "98493   70617\n" +
                "78396   98075\n" +
                "59508   31032\n" +
                "14533   87339\n" +
                "65929   90988\n" +
                "12476   17041\n" +
                "18406   31963\n" +
                "84233   66617\n" +
                "12813   20863\n" +
                "87866   98750\n" +
                "92020   16503\n" +
                "86199   29241\n" +
                "14865   64023\n" +
                "77251   18843\n" +
                "29087   16712\n" +
                "89093   67919\n" +
                "84823   52315\n" +
                "97124   63689\n" +
                "21993   38094\n" +
                "52548   98181\n" +
                "64426   38094\n" +
                "39508   81972\n" +
                "88707   37155\n" +
                "77577   41917\n" +
                "69880   57192\n" +
                "44717   79597\n" +
                "60859   67919\n" +
                "12172   39516\n" +
                "52315   77348\n" +
                "34818   40971\n" +
                "68237   47371\n" +
                "90048   31492\n" +
                "91780   91254\n" +
                "83184   65480\n" +
                "47595   13030\n" +
                "93135   39092\n" +
                "90044   52315\n" +
                "57788   93726\n" +
                "62763   23239\n" +
                "89761   38094\n" +
                "10716   98750\n" +
                "35248   55737\n" +
                "59494   68055\n" +
                "16810   67131\n" +
                "88942   31963\n" +
                "76030   59024\n" +
                "68413   56574\n" +
                "71633   40971\n" +
                "27617   46689\n" +
                "61233   48940\n" +
                "13658   34496\n" +
                "40703   65209\n" +
                "28669   83621\n" +
                "70132   52315\n" +
                "37900   46800\n" +
                "36084   12920\n" +
                "70378   60859\n" +
                "82602   86916\n" +
                "38476   25624\n" +
                "11688   52315\n" +
                "63095   73739\n" +
                "83433   37370\n" +
                "66582   31849\n" +
                "44408   68006\n" +
                "91580   13383\n" +
                "41394   18554\n" +
                "15054   21090\n" +
                "83901   91254\n" +
                "68378   12571\n" +
                "70868   72055\n" +
                "25682   99471\n" +
                "80283   84823\n" +
                "58774   91254\n" +
                "15043   44002\n" +
                "62670   73739\n" +
                "55915   52315\n" +
                "34285   50248\n" +
                "45860   50682\n" +
                "26145   82948\n" +
                "44170   74880\n" +
                "69068   84270\n" +
                "38169   38094\n" +
                "15020   21645\n" +
                "48351   46795\n" +
                "52242   17322\n" +
                "57262   46257\n" +
                "45360   52054\n" +
                "57518   87339\n" +
                "12487   63515\n" +
                "13358   15895\n" +
                "38204   73180\n" +
                "37940   94820\n" +
                "75950   97855\n" +
                "98789   72251\n" +
                "55604   92176\n" +
                "39930   61056\n" +
                "84928   39489\n" +
                "93961   90584\n" +
                "85987   87014\n" +
                "27022   40307\n" +
                "77327   63825\n" +
                "57151   31963\n" +
                "86379   82871\n" +
                "37155   88222\n" +
                "44284   84823\n" +
                "34832   96979\n" +
                "85214   69001\n" +
                "88783   27436\n" +
                "12782   31963\n" +
                "70752   80954\n" +
                "97651   23189\n" +
                "46554   46907\n" +
                "43866   38094\n" +
                "60090   58763\n" +
                "89564   22691\n" +
                "11558   52445\n" +
                "61150   58975\n" +
                "11230   29247\n" +
                "46103   98325\n" +
                "31204   44018\n" +
                "44420   71528\n" +
                "33659   10730\n" +
                "30098   69230\n" +
                "77473   98410\n" +
                "67198   63825\n" +
                "91560   90988\n" +
                "17842   18473\n" +
                "31031   10138\n" +
                "25221   60859\n" +
                "62150   66417\n" +
                "14373   91254\n" +
                "33995   70555\n" +
                "32172   57970\n" +
                "36488   94041\n" +
                "95747   56450\n" +
                "61567   90066\n" +
                "74271   80136\n" +
                "51290   96535\n" +
                "27995   31963\n" +
                "63515   87339\n" +
                "72055   18311\n" +
                "22226   63515\n" +
                "59375   81818\n" +
                "76512   49521\n" +
                "85812   78856\n" +
                "27537   78736\n" +
                "87666   32193\n" +
                "27624   12413\n" +
                "64096   61750\n" +
                "10749   20692\n" +
                "27436   52315\n" +
                "75435   50309\n" +
                "86558   60859\n" +
                "25138   18662\n" +
                "41356   60859\n" +
                "68760   72055\n" +
                "45574   25507\n" +
                "21577   98942\n" +
                "31881   81870\n" +
                "65016   73739\n" +
                "90656   32647\n" +
                "24122   87339\n" +
                "78458   60859\n" +
                "99290   42530\n" +
                "63362   74484\n" +
                "45324   74474\n" +
                "55742   48062\n" +
                "46944   44844\n" +
                "71534   20692\n" +
                "38348   53179\n" +
                "90391   31963\n" +
                "63186   72873\n" +
                "43435   52315\n" +
                "96716   32259\n" +
                "99923   55737\n" +
                "90098   70281\n" +
                "14525   93644\n" +
                "14634   38094\n" +
                "15853   78345\n" +
                "33108   33722\n" +
                "83439   51275\n" +
                "93742   60859\n" +
                "68758   90988\n" +
                "34771   17456\n" +
                "29473   47384\n" +
                "27697   39570\n" +
                "29944   50455\n" +
                "50249   32302\n" +
                "89444   99416\n" +
                "30805   90988\n" +
                "94132   61365\n" +
                "98750   31849\n" +
                "83186   76750\n" +
                "52252   65184\n" +
                "89753   72055\n" +
                "98197   98697\n" +
                "76750   72055\n" +
                "21126   67274\n" +
                "21641   34760\n" +
                "62076   33495\n" +
                "14579   64696\n" +
                "22715   81980\n" +
                "90163   12406\n" +
                "95784   68047\n" +
                "85724   87339\n" +
                "41620   10409\n" +
                "92753   76750\n" +
                "37666   91254\n" +
                "38137   46672\n" +
                "47110   60859\n" +
                "54543   23101\n" +
                "26495   51493\n" +
                "43159   27360\n" +
                "61846   39431\n" +
                "83787   84233\n" +
                "13506   20222\n" +
                "60298   31345\n" +
                "21742   73739\n" +
                "91928   76750\n" +
                "67392   27089\n" +
                "59447   88657\n" +
                "10147   52315\n" +
                "88420   63825\n" +
                "84317   67919\n" +
                "18279   84823\n" +
                "15984   90756\n" +
                "83897   38094\n" +
                "17524   90988\n" +
                "26017   45126\n" +
                "98635   20112\n" +
                "82243   27089\n" +
                "26750   26406\n" +
                "69469   77146\n" +
                "89732   11124\n" +
                "41258   17720\n" +
                "48062   78300\n" +
                "68561   13517\n" +
                "34283   85667\n" +
                "97835   43741\n" +
                "21351   67919\n" +
                "32372   16720\n" +
                "14088   38936\n" +
                "89173   10152\n" +
                "69129   43769\n" +
                "46965   73739\n" +
                "47834   91233\n" +
                "17627   19189\n" +
                "12268   67826\n" +
                "37356   52315\n" +
                "68366   63825\n" +
                "50838   29430\n" +
                "94974   62978\n" +
                "65427   92335\n" +
                "78704   92785\n" +
                "98194   31849\n" +
                "94860   91254\n" +
                "10413   52315\n" +
                "99435   76750\n" +
                "16749   73328\n" +
                "43068   16548\n" +
                "18135   40488\n" +
                "58421   12600\n" +
                "37910   92811\n" +
                "28769   34293\n" +
                "95334   30803\n" +
                "67748   59225\n" +
                "44365   31963\n" +
                "29273   20692\n" +
                "46370   60859\n" +
                "47709   63912\n" +
                "63775   84823\n" +
                "75548   28296\n" +
                "33798   38094\n" +
                "69672   89607\n" +
                "74754   73739\n" +
                "49066   30017\n" +
                "89756   52315\n" +
                "67919   43998\n" +
                "88061   68521\n" +
                "39137   50152\n" +
                "59338   49890\n" +
                "44756   90707\n" +
                "98359   36495\n" +
                "10113   80721\n" +
                "96163   13016\n" +
                "18965   30702\n" +
                "95671   81809\n" +
                "78007   93680\n" +
                "72250   92806\n" +
                "24831   48062\n" +
                "93561   25138\n" +
                "73962   87667\n" +
                "90248   48062\n" +
                "95762   63442\n" +
                "96852   50225\n" +
                "36995   31227\n" +
                "87401   91254\n" +
                "30838   84649\n" +
                "11224   48062\n" +
                "79061   50682\n" +
                "83824   20112\n" +
                "61242   75132\n" +
                "97196   31849\n" +
                "31927   48062\n" +
                "22087   72055\n" +
                "64178   33632\n" +
                "92080   70089\n" +
                "84339   28433\n" +
                "57804   76750\n" +
                "25387   37155\n" +
                "81722   84823\n" +
                "86463   63825\n" +
                "26959   84233\n" +
                "74918   36995\n" +
                "47554   71702\n" +
                "51450   77114\n" +
                "15753   64312\n" +
                "79468   83563\n" +
                "60172   63825\n" +
                "89187   66416\n" +
                "47552   84233\n" +
                "63836   96955\n" +
                "50736   60859\n" +
                "46257   33617\n" +
                "27477   63628\n" +
                "94159   73739\n" +
                "26339   27964\n" +
                "99674   93217\n" +
                "61250   23628\n" +
                "94382   64265\n" +
                "11539   50180\n" +
                "10492   62057\n" +
                "15414   82089\n" +
                "81830   76750\n" +
                "79729   32501\n" +
                "59935   78410\n" +
                "55737   91254\n" +
                "33501   31849\n" +
                "98398   50682\n" +
                "97275   76602\n" +
                "38887   86626\n" +
                "48245   15889\n" +
                "67814   41213\n" +
                "28276   96218\n" +
                "52995   25138\n" +
                "51768   84823\n" +
                "23366   67919\n" +
                "58043   94722\n" +
                "33655   56522\n" +
                "50043   72450\n" +
                "73839   90440\n" +
                "10752   63825\n" +
                "15750   19911\n" +
                "99509   60996\n" +
                "12456   87339\n" +
                "20727   90988\n" +
                "62359   40971\n" +
                "81671   64213\n" +
                "91541   35482\n" +
                "94485   50682\n" +
                "67680   37155\n" +
                "63058   32117\n" +
                "50090   98750\n" +
                "61000   60859\n" +
                "11341   81637\n" +
                "10675   70533\n" +
                "22159   99742\n" +
                "99705   32116\n" +
                "32085   78422\n" +
                "56367   18049\n" +
                "78611   64924\n" +
                "90242   50682\n" +
                "61570   68777\n" +
                "98193   79855\n" +
                "63068   73739\n" +
                "53915   13627\n" +
                "92664   33858\n" +
                "82118   62671\n" +
                "23234   31957\n" +
                "94674   39489\n" +
                "32450   55737\n" +
                "59276   99636\n" +
                "39738   42163\n" +
                "42659   31849\n" +
                "29950   38094\n" +
                "17039   96134\n" +
                "31374   52568\n" +
                "13625   72109\n" +
                "33042   27336\n" +
                "84607   97422\n" +
                "31849   20692\n" +
                "17061   20500\n" +
                "12380   20692\n" +
                "55834   76750\n" +
                "40260   40971\n" +
                "58188   99023\n" +
                "45619   90988\n" +
                "46734   72495\n" +
                "25567   37155\n" +
                "27593   36939\n" +
                "27705   27436\n" +
                "35918   53049\n" +
                "72395   22908\n" +
                "83024   25138\n" +
                "59905   50682\n" +
                "29942   51044\n" +
                "23864   79568\n" +
                "55150   40971\n" +
                "39901   73739\n" +
                "51429   84499\n" +
                "26667   56600\n" +
                "20692   49999\n" +
                "44423   48413\n" +
                "89639   90988\n" +
                "62449   23693\n" +
                "82368   68603\n" +
                "37998   60859\n" +
                "91308   84355\n" +
                "47625   84233\n" +
                "87235   48062\n" +
                "10479   40971\n" +
                "12470   77812\n" +
                "79398   92110\n" +
                "24157   35490\n" +
                "84322   84823\n" +
                "44438   27300\n" +
                "46201   37155\n" +
                "15815   44116\n" +
                "52626   38094\n" +
                "15858   46133\n" +
                "89797   98911\n" +
                "76844   17965\n" +
                "36493   81353\n" +
                "68425   84823\n" +
                "22137   60859\n" +
                "77167   33379\n" +
                "87697   19256\n" +
                "41603   27345\n" +
                "93230   87339\n" +
                "34535   39068\n" +
                "62368   31963\n" +
                "71318   34890\n" +
                "14566   52315\n" +
                "90439   45351\n" +
                "87013   50682\n" +
                "85339   92917\n" +
                "91534   63322\n" +
                "90988   31849\n" +
                "37108   89248\n" +
                "25398   15630\n" +
                "60269   46354\n" +
                "73929   31963\n" +
                "85753   89789\n" +
                "13055   76464\n" +
                "79991   88707\n" +
                "63825   91254\n" +
                "98473   56091\n" +
                "64938   57251\n" +
                "38094   38881\n" +
                "50465   22038\n" +
                "73037   10811\n" +
                "75967   49581\n" +
                "68942   84233\n" +
                "71786   76750\n" +
                "99611   50682\n" +
                "17590   35221\n" +
                "87318   16184\n" +
                "38505   36185\n" +
                "19563   71760\n" +
                "91493   59209\n" +
                "75286   91254\n" +
                "54534   45259\n" +
                "70281   24482\n" +
                "30770   52315\n" +
                "84275   55737\n" +
                "64420   41263\n" +
                "67601   56131\n" +
                "16784   14971\n" +
                "46723   71705\n" +
                "49609   33279\n" +
                "10952   52768\n" +
                "40729   44124\n" +
                "90745   77061\n" +
                "34124   87339\n" +
                "79459   19662\n" +
                "59660   88336\n" +
                "33724   76750\n" +
                "41878   31471\n" +
                "29912   36995\n" +
                "21386   84233\n" +
                "32945   87339\n" +
                "39159   86983\n" +
                "81459   50051\n" +
                "63810   76750\n" +
                "27827   72336\n" +
                "75116   76750\n" +
                "70438   85513\n" +
                "63535   37155\n" +
                "55684   39489\n" +
                "96958   95080\n" +
                "62793   40971\n" +
                "48649   37155\n" +
                "73108   38479\n" +
                "12038   73035\n" +
                "49718   94369\n" +
                "49882   21814\n" +
                "90650   34851\n" +
                "11116   61714\n" +
                "79917   51077\n" +
                "62707   55628\n" +
                "92459   96915\n" +
                "95690   53399\n" +
                "24211   27436\n" +
                "87266   91254\n" +
                "15847   12424\n" +
                "17896   54529\n" +
                "53974   84823\n" +
                "92698   72470\n" +
                "40973   38630\n" +
                "24809   20692\n" +
                "71610   59555\n" +
                "67213   88707\n" +
                "42767   79241\n" +
                "96580   42503\n" +
                "79226   82565\n" +
                "12051   34910\n" +
                "14600   90988\n" +
                "70962   48062\n" +
                "72321   73739\n" +
                "66896   77565\n" +
                "55308   60714\n" +
                "32305   40971\n" +
                "15705   60028\n" +
                "20331   48062\n" +
                "90356   91254\n" +
                "27446   21289\n" +
                "32691   31849\n" +
                "88785   48062\n" +
                "51419   28561\n" +
                "44311   79505\n" +
                "95234   57870\n" +
                "12935   40971\n" +
                "62198   91752\n" +
                "26331   82576\n" +
                "63091   91254\n" +
                "28603   82261\n" +
                "40147   67117\n" +
                "83978   77859\n" +
                "19279   56339\n" +
                "30511   77718\n" +
                "19793   87363\n" +
                "67630   67919\n" +
                "85108   17324\n" +
                "37977   15731\n" +
                "58983   49370\n" +
                "68423   35881\n" +
                "10224   74695\n" +
                "41736   40884\n" +
                "13590   91254\n" +
                "23362   40971\n" +
                "99499   65408\n" +
                "16460   73297\n" +
                "35426   69103\n" +
                "14873   10331\n" +
                "80614   98750\n" +
                "27859   86699\n" +
                "94072   52315\n" +
                "18981   27436\n" +
                "51030   63825\n" +
                "31979   31974\n" +
                "10060   49581\n" +
                "97457   59642\n" +
                "31057   52315\n" +
                "98560   84823\n" +
                "47286   38094\n" +
                "35565   40971\n" +
                "42285   54785\n" +
                "81392   82713\n" +
                "22878   48062\n" +
                "34487   65138\n" +
                "24156   93846\n" +
                "57704   49888\n" +
                "51352   33050\n" +
                "73714   50682\n" +
                "73960   47692\n" +
                "14686   25215\n" +
                "38555   40971\n" +
                "92632   61868\n" +
                "12529   48062\n" +
                "48406   66247\n" +
                "44504   70356\n" +
                "78562   84823\n" +
                "21381   89200\n" +
                "93855   56801\n" +
                "45470   48023\n" +
                "13650   59647\n" +
                "82960   46206\n" +
                "40965   72192\n" +
                "31963   45048\n" +
                "48040   67919\n" +
                "53457   76750\n" +
                "47995   38468\n" +
                "56904   73507\n" +
                "53710   74022\n" +
                "99557   67919\n" +
                "52346   87339\n" +
                "22009   31849\n" +
                "10126   20692\n" +
                "96604   46257\n" +
                "76629   49581\n" +
                "87339   22783\n" +
                "53577   32708\n" +
                "93143   24815\n" +
                "95929   82359\n" +
                "41268   76312\n" +
                "28360   50433\n" +
                "18926   20246\n" +
                "44735   55737\n" +
                "21754   94200\n" +
                "45995   20692\n" +
                "91603   57841\n" +
                "69767   82262\n" +
                "37282   80348\n" +
                "17730   76897\n" +
                "19647   24004\n" +
                "97462   76346\n" +
                "71047   62037\n" +
                "34121   72977\n" +
                "49581   84188\n" +
                "92169   33396\n" +
                "14641   72055\n" +
                "39489   56331\n" +
                "64286   36007\n" +
                "66660   55737\n" +
                "61013   57502\n" +
                "93637   89277\n" +
                "79890   46257\n" +
                "36204   69809\n" +
                "87899   98750\n" +
                "90417   60859\n" +
                "66456   67919\n" +
                "31910   50411\n" +
                "95024   24713\n" +
                "53501   97080\n" +
                "47761   52315\n" +
                "91582   45390\n" +
                "35753   93253\n" +
                "20424   98133\n" +
                "52448   67528\n" +
                "39925   38895\n" +
                "28344   21734\n" +
                "54088   88707\n" +
                "40684   79586\n" +
                "63495   39489\n" +
                "42745   46257\n" +
                "36411   20692\n" +
                "24189   73700\n" +
                "63663   55737\n" +
                "51325   97464\n" +
                "35638   57921\n" +
                "16147   97192\n" +
                "65808   26709\n" +
                "93854   21334\n" +
                "83029   98750\n" +
                "85681   31849\n" +
                "85513   20692\n" +
                "48163   33364\n" +
                "64824   70813\n" +
                "80330   59638\n" +
                "68279   56091\n" +
                "63850   98633\n" +
                "64014   31963\n" +
                "39492   91576\n" +
                "24595   82232\n" +
                "53478   67388\n" +
                "33189   72055\n" +
                "79380   84119\n" +
                "74284   54996\n" +
                "70140   69650\n" +
                "86881   87339\n" +
                "66639   98974\n" +
                "67556   62236\n" +
                "85378   37807\n" +
                "93552   11734\n" +
                "77734   87339\n" +
                "84788   63515\n" +
                "25658   73739\n" +
                "50845   42313\n" +
                "39182   24860\n" +
                "39825   50682\n" +
                "50295   63515\n" +
                "66539   21906\n" +
                "31197   73739\n" +
                "40971   31849\n" +
                "12253   54780\n" +
                "89300   49136\n" +
                "64819   18235\n" +
                "38111   67613\n" +
                "29614   71066\n" +
                "94658   79493\n" +
                "35651   13233\n" +
                "34949   41218\n" +
                "41470   40932\n" +
                "56805   58595\n" +
                "97958   27436\n" +
                "41542   43810\n" +
                "98116   87339\n" +
                "95005   64201\n" +
                "26689   73039\n" +
                "87929   72055\n" +
                "48643   65869\n" +
                "44264   80510\n" +
                "42574   36244\n" +
                "63706   36541\n" +
                "10516   20692\n" +
                "81888   48062\n" +
                "46840   49581\n" +
                "88271   62250\n" +
                "94269   13433\n" +
                "72975   51346\n" +
                "40378   31963\n" +
                "85436   67919\n" +
                "98412   31849\n" +
                "16302   25890\n" +
                "92817   76750\n" +
                "73558   95672\n" +
                "61378   27919\n" +
                "19104   34857\n" +
                "86385   27774\n" +
                "18893   20421\n" +
                "62394   27466\n" +
                "97168   78422\n" +
                "76828   20692\n" +
                "57785   11439\n" +
                "69161   84823\n" +
                "81891   88707\n" +
                "14398   50682\n" +
                "75597   84233\n" +
                "40237   74679\n" +
                "74627   72055\n" +
                "68878   44137\n" +
                "64971   55565\n" +
                "83067   91254\n" +
                "77491   79186\n" +
                "88686   15795\n" +
                "57603   13448\n" +
                "45266   68597\n" +
                "33706   36802\n" +
                "26544   90988\n" +
                "80230   41517\n" +
                "98279   37155\n" +
                "75578   87339\n" +
                "78560   90689\n" +
                "53825   69683\n" +
                "46223   35266\n" +
                "50699   31963\n" +
                "11507   30160\n" +
                "98508   73739\n" +
                "85131   90605\n" +
                "51806   78874\n" +
                "66216   29974\n" +
                "55896   72055\n" +
                "87983   45827\n" +
                "37421   24722\n" +
                "27089   72055\n" +
                "35796   31849\n" +
                "50647   46257\n" +
                "18865   87578\n" +
                "95580   48404\n" +
                "95447   60859\n" +
                "57831   29451\n" +
                "74714   36995\n" +
                "81845   11460\n" +
                "42033   66983\n" +
                "77846   87339\n" +
                "68670   86138\n" +
                "48821   50682\n" +
                "58352   37624\n" +
                "76352   73739\n" +
                "27924   45322\n" +
                "14974   58194\n" +
                "19887   19109\n" +
                "23329   85568\n" +
                "20214   61048\n" +
                "36738   48062\n" +
                "64224   63825\n" +
                "56209   40971\n" +
                "63592   90988\n" +
                "96560   76137\n" +
                "73748   48062\n" +
                "90647   86904\n" +
                "10910   88920\n" +
                "85440   41920\n" +
                "33264   90988\n" +
                "76674   75533\n" +
                "54141   16463\n" +
                "68367   86319\n" +
                "46421   73739\n" +
                "71740   26423\n" +
                "84766   10695\n" +
                "83450   14876\n" +
                "59985   31963\n" +
                "77991   60859\n" +
                "91254   84233\n" +
                "70747   31849\n" +
                "39254   26780\n" +
                "16062   25138\n" +
                "78945   65871\n" +
                "50682   27436\n" +
                "65403   91254\n" +
                "95579   60732\n" +
                "21033   29762\n" +
                "29307   58721\n" +
                "69595   98750\n" +
                "40807   84823\n" +
                "19522   93019\n" +
                "90505   40971\n" +
                "53911   90998\n" +
                "52411   91271\n" +
                "75197   48589\n" +
                "90568   48062\n" +
                "86892   84823\n" +
                "15662   62119\n" +
                "60408   73739\n" +
                "61681   46257\n" +
                "81491   31034\n" +
                "83205   39489"
    }
}